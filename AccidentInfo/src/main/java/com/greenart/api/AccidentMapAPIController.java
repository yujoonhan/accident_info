package com.greenart.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.greenart.service.AccidentMapService;
import com.greenart.vo.AccidentMapVO;

@RestController
public class AccidentMapAPIController {
    @Autowired
    AccidentMapService service;
    
    // 노인
    @GetMapping("/api/accident_old_map")
    public Map<String, Object> getAccidentOldMapInfo() throws Exception{
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552061/frequentzoneOldman/getRestFrequentzoneOldman"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=XcMVI%2BPYP9PXFzduwTkGpO3CLQp%2BznCPhBdTLXkiDkvBUpEmttNmd%2FN0xAzf1q%2FFNw0nDMBjCfLYb%2Bj9MJxTFg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("searchYearCd","UTF-8") + "=" + URLEncoder.encode("2015", "UTF-8")); /*조회하고자 하는 연도값 입력(값 없을 시 공백리턴)*/
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
            resultMap.put("status", false);
            resultMap.put("message", "데이터가 없습니다");
            return resultMap;
        }

        for(int i=0; i<nList.getLength(); i++) {
            Node node = nList.item(i);
            Element elem = (Element) node;
            // System.out.println(getTagValue("sido_sgg_nm", elem));
            // System.out.println(getTagValue("spot_nm", elem));
            // System.out.println(getTagValue("lo_crd", elem));
            // System.out.println(getTagValue("la_crd", elem));
            // System.out.println("====================================");

            AccidentMapVO vo = new AccidentMapVO();
            vo.setSido_sgg_nm(getTagValue("sido_sgg_nm", elem));
            vo.setSpot_nm(getTagValue("spot_nm", elem));
            vo.setLo_crd(getTagValue("lo_crd", elem));
            vo.setLa_crd(getTagValue("la_crd", elem));
            vo.setYearDt("2015");
            System.out.println(vo);
            service.insertAccOldMap(vo);
        }

        resultMap.put("status", true);
        resultMap.put("message", "데이터가 입력되었습니다.");
        return resultMap;
    }

    public static String getTagValue(String tag, Element elem) {
        NodeList nlList = elem.getElementsByTagName(tag).item(0).getChildNodes();
        if(nlList == null) {
            return null;
        }
        Node node = (Node) nlList.item(0);
        if(node == null) {
            return null;
        }
        return node.getNodeValue();
    }

    @GetMapping("/api/accident_chd_map")
    public Map<String, Object> getAccidentChdMapInfo() throws Exception{
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552061/frequentzoneChild/getRestFrequentzoneChild"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=XcMVI%2BPYP9PXFzduwTkGpO3CLQp%2BznCPhBdTLXkiDkvBUpEmttNmd%2FN0xAzf1q%2FFNw0nDMBjCfLYb%2Bj9MJxTFg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("searchYearCd","UTF-8") + "=" + URLEncoder.encode("2015", "UTF-8")); /*조회하고자 하는 연도값 입력(값 없을 시 공백리턴)*/
        urlBuilder.append("&" + URLEncoder.encode("siDo","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*코드종류 코드값전체 공백시 전체 선택서울특별시 11부산광역시 26대구광역시 27인천광역시 28광주광역시 29대전광역시 30울산광역시 31세종특별자치시 36경기도 41강원도 42충청북도 43충청남도 44전라북도 45전라남도 46경상북도 47경상남도 48제주특별자치도 50*/
        urlBuilder.append("&" + URLEncoder.encode("guGun","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*시도 코드종류 코드값서울특별시 강남구 680 강동구 740 강북구 305 강서구 500 관악구 620 광진구 215 구로구 530 금천구 545 노원구 350 도봉구 320 동대문구 230 동작구 590 마포구 440 서대문구 410 서초구 650 성동구 200 성북구 290 송파구 710 양천구 470 영등포구 560 용산구 170 은평구 380 종로구 110 중구 140 중랑구 260부산광역시 강서구 4*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*결과형식(xml/json)*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*검색건수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(urlBuilder.toString());

        doc.getDocumentElement().normalize();
        System.out.println(doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("item");
        if(nList.getLength() <= 0) {
            resultMap.put("status", false);
            resultMap.put("message", "데이터가 없습니다");
            return resultMap;
        }
        for(int i=0; i<nList.getLength(); i++) {
            Node node = nList.item(i);
            Element elem = (Element) node;
            // System.out.println(getTagValue("sido_sgg_nm", elem));
            // System.out.println(getTagValue("spot_nm", elem));
            // System.out.println(getTagValue("lo_crd", elem));
            // System.out.println(getTagValue("la_crd", elem));
            // System.out.println("====================================");

            AccidentMapVO vo = new AccidentMapVO();
            vo.setSido_sgg_nm(getTagValue("sido_sgg_nm", elem));
            vo.setSpot_nm(getTagValue("spot_nm", elem));
            vo.setLo_crd(getTagValue("lo_crd", elem));
            vo.setLa_crd(getTagValue("la_crd", elem));
            vo.setYearDt("2015");
            System.out.println(vo);
            service.insertAccChdMap(vo);
        }

        resultMap.put("status", true);
        resultMap.put("message", "데이터가 입력되었습니다.");
        return resultMap;
    }

    // 자전거 보행 사고
    @GetMapping("/api/accident_byc_map")
    public Map<String, Object> getAccidentBycMapInfo() throws Exception{
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552061/frequentzoneBicycle/getRestFrequentzoneBicycle"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=XcMVI%2BPYP9PXFzduwTkGpO3CLQp%2BznCPhBdTLXkiDkvBUpEmttNmd%2FN0xAzf1q%2FFNw0nDMBjCfLYb%2Bj9MJxTFg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("searchYearCd","UTF-8") + "=" + URLEncoder.encode("2015", "UTF-8")); /*조회하고자 하는 연도값 입력(값 없을 시 공백리턴)*/
        urlBuilder.append("&" + URLEncoder.encode("siDo","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*코드종류 코드값전체 공백시 전체 선택서울특별시 11부산광역시 26대구광역시 27인천광역시 28광주광역시 29대전광역시 30울산광역시 31세종특별자치시 36경기도 41강원도 42충청북도 43충청남도 44전라북도 45전라남도 46경상북도 47경상남도 48제주특별자치도 50*/
        urlBuilder.append("&" + URLEncoder.encode("guGun","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*시도 코드종류 코드값서울특별시 강남구 680 강동구 740 강북구 305 강서구 500 관악구 620 광진구 215 구로구 530 금천구 545 노원구 350 도봉구 320 동대문구 230 동작구 590 마포구 440 서대문구 410 서초구 650 성동구 200 성북구 290 송파구 710 양천구 470 영등포구 560 용산구 170 은평구 380 종로구 110 중구 140 중랑구 260부산광역시 강서구 4*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*결과형식(xml/json)*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*검색건수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(urlBuilder.toString());

        doc.getDocumentElement().normalize();
        System.out.println(doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("item");
        if(nList.getLength() <= 0) {
            resultMap.put("status", false);
            resultMap.put("message", "데이터가 없습니다");
            return resultMap;
        }
        for(int i=0; i<nList.getLength(); i++) {
            Node node = nList.item(i);
            Element elem = (Element) node;
            // System.out.println(getTagValue("sido_sgg_nm", elem));
            // System.out.println(getTagValue("spot_nm", elem));
            // System.out.println(getTagValue("lo_crd", elem));
            // System.out.println(getTagValue("la_crd", elem));
            // System.out.println("====================================");

            AccidentMapVO vo = new AccidentMapVO();
            vo.setSido_sgg_nm(getTagValue("sido_sgg_nm", elem));
            vo.setSpot_nm(getTagValue("spot_nm", elem));
            vo.setLo_crd(getTagValue("lo_crd", elem));
            vo.setLa_crd(getTagValue("la_crd", elem));
            vo.setYearDt("2015");
            System.out.println(vo);
            service.insertAccBycMap(vo);
        }

        resultMap.put("status", true);
        resultMap.put("message", "데이터가 입력되었습니다.");
        return resultMap;
    }

    @GetMapping("/api/oldMap/{region}")
    public Map<String, Object> getMapInfo(
        @PathVariable @Nullable String region
    ){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        region = region + "%";
        List<AccidentMapVO> vo = service.selectOldMap(region);
        resultMap.put("oldMap", vo);
        return resultMap;
    }

    // @GetMapping("/api/chdMap/{region}")
    // public Map<String, Object> getChdMapInfo(
    //     @PathVariable @Nullable String region
    // ){
    //     Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
    //     region = region + "%";
    //     List<AccidentMapVO> vo = service.selectChdMap(region);
    //     resultMap.put("chdMap", vo);
    //     return resultMap;
    // }

    // @GetMapping("/api/bycMap/{region}")
    // public Map<String, Object> getBycMapInfo(
    //     @PathVariable @Nullable String region
    // ){
    //     Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
    //     region = region + "%";
    //     List<AccidentMapVO> vo = service.selectBycMap(region);
    //     resultMap.put("bycMap", vo);
    //     return resultMap;
    // }
    
}
