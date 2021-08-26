package com.greenart.api;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.greenart.service.TrafficInfoService;
import com.greenart.vo.TrafficInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@RestController
public class TrafficAPIController {
    @Autowired
    TrafficInfoService service;

    @GetMapping("/api/traffic")
    public Map<String, Object> getTrafficInfo() throws Exception{
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        StringBuilder urlBuilder = new StringBuilder("http://data.ex.co.kr/openapi/trafficapi/nationalTrafficVolumn"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("key","UTF-8") + "=9056897733"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*결과형식(xml/json)*/
        urlBuilder.append("&" + URLEncoder.encode("sumDate","UTF-8") + "=" + URLEncoder.encode("20150101", "UTF-8")); 
        
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(urlBuilder.toString());

        doc.getDocumentElement().normalize();
        System.out.println(doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("list");
        System.out.println(nList.getLength());
        // if(nList.getLength() <= 0) {
        //     resultMap.put("status", false);
        //     resultMap.put("message", "데이터가 없습니다");
        //     return resultMap;
        // }
        // for(int i=0; i<nList.getLength(); i++) {
        //     Node node = nList.item(i);
        //     Element elem = (Element) node;
        //     // System.out.println(getTagValue("sumDate", elem));
        //     // System.out.println(getTagValue("trafficVolumn", elem));
        //     System.out.println("====================================");

        //     TrafficInfoVO vo = new TrafficInfoVO();
        //     vo.setTrafficVolumn(Integer.parseInt(getTagValue("trafficVolumn", elem)));
            
        //     Date dt = new Date();
        //     SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
        //     dt = dtFormat.parse(getTagValue("sumDate", elem));
        //     vo.setSumDate(dt);
        //     System.out.println(vo);
            // service.insertAccidentBycInfo(vo);
        // }

        // resultMap.put("status", true);
        // resultMap.put("message", "데이터가 입력되었습니다.");
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

}
