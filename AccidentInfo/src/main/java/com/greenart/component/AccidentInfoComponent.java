package com.greenart.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.greenart.service.AccidentInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.greenart.vo.AccidentOldInfoVO;

import java.net.URLEncoder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Component
public class AccidentInfoComponent {
    @Autowired
    AccidentInfoService service;
    // 매일 10시에 호출
    @Scheduled(cron="0 0 10 * * *")
    public void getAccidentInfo() throws Exception{
        System.out.println("cron schedule");
        Date dt = new Date();
        SimpleDateFormat dtFormatter = new SimpleDateFormat("YYYY");
        String today = dtFormatter.format(dt);
        // System.out.println(today);
        
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552061/frequentzoneOldman/getRestFrequentzoneOldman"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=XcMVI%2BPYP9PXFzduwTkGpO3CLQp%2BznCPhBdTLXkiDkvBUpEmttNmd%2FN0xAzf1q%2FFNw0nDMBjCfLYb%2Bj9MJxTFg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("searchYearCd","UTF-8") + "=" + URLEncoder.encode(today, "UTF-8")); /*조회하고자 하는 연도값 입력(값 없을 시 공백리턴)*/
        urlBuilder.append("&" + URLEncoder.encode("siDo","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*코드종류 코드값전체 공백시 전체 선택서울특별시 11부산광역시 26대구광역시 27인천광역시 28광주광역시 29대전광역시 30울산광역시 31세종특별자치시 36경기도 41강원도 42충청북도 43충청남도 44전라북도 45전라남도 46경상북도 47경상남도 48제주특별자치도 50*/
        urlBuilder.append("&" + URLEncoder.encode("guGun","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*시도 코드종류 코드값서울특별시 강남구 680 강동구 740 강북구 305 강서구 500 관악구 620 광진구 215 구로구 530 금천구 545 노원구 350 도봉구 320 동대문구 230 동작구 590 마포구 440 서대문구 410 서초구 650 성동구 200 성북구 290 송파구 710 양천구 470 영등포구 560 용산구 170 은평구 380 종로구 110 중구 140 중랑구 260부산광역시 강서구 4*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*결과형식(xml/json)*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10000", "UTF-8")); /*검색건수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(urlBuilder.toString());

        doc.getDocumentElement().normalize();
        System.out.println(doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("item");
        if(nList.getLength() <= 0) {
            return;
        }

        for(int i=0; i<nList.getLength(); i++) {
            Node node = nList.item(i);
            Element elem = (Element) node;

            AccidentOldInfoVO vo = new AccidentOldInfoVO();
            vo.setSido_sgg_nm(getTagValue("sido_sgg_nm", elem));
            vo.setSpot_nm(getTagValue("spot_nm", elem));
            vo.setOccrrnc_cnt(Integer.parseInt(getTagValue("occrrnc_cnt", elem)));
            vo.setCaslt_cnt(Integer.parseInt(getTagValue("caslt_cnt", elem)));
            vo.setDth_dnv_cnt(Integer.parseInt(getTagValue("dth_dnv_cnt", elem)));
            vo.setSe_dnv_cnt(Integer.parseInt(getTagValue("se_dnv_cnt", elem)));
            vo.setSl_dnv_cnt(Integer.parseInt(getTagValue("sl_dnv_cnt", elem)));

            Date createDt = new Date();
            SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy");
            createDt = dtFormat.parse(today);
            vo.setYearDt(createDt);
            System.out.println(vo);
            // service.insertAccidentOldInfo(vo);
        }
    }

    public static String getTagValue(String tag, Element elem) {
        NodeList nlList = elem.getElementsByTagName(tag).item(0).getChildNodes();
        if(nlList == null) {return null;}
        Node node = (Node) nlList.item(0);
        if(node == null) {return null;}
        return node.getNodeValue();
    }
}
