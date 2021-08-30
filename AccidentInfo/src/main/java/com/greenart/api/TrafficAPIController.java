package com.greenart.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

import com.greenart.mapper.TrafficInfoMapper;
import com.greenart.service.TrafficInfoService;
import com.greenart.vo.TrafficCarInfoVO;
import com.greenart.vo.TrafficInfoVO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrafficAPIController {
    @Autowired
    TrafficInfoMapper mapper;
    @Autowired
    TrafficInfoService service;

    @GetMapping("/api/traffic")
    public String getTrafficInfo() throws IOException{
        StringBuilder urlBuilder = new StringBuilder("http://api.odcloud.kr/api/15043750/v1/uddi:92d48df6-291c-4dda-8b1f-bd6c022e2ca5"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("page","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("perPage","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식(xml/json)*/
        urlBuilder.append("&" + URLEncoder.encode("serviceKey","UTF-8") + "=XcMVI%2BPYP9PXFzduwTkGpO3CLQp%2BznCPhBdTLXkiDkvBUpEmttNmd%2FN0xAzf1q%2FFNw0nDMBjCfLYb%2Bj9MJxTFg%3D%3D"); /*Service Key*/
        
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("ContentType", "application/json");
        System.out.println("code : "+conn.getResponseCode());
        System.out.println("message : "+conn.getResponseMessage());

        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        }
        else {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line = null;
        while((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();

        try{
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(sb.toString());
            JSONArray dataArray = (JSONArray) jsonObj.get("data");
            for(int i=0; i<dataArray.size(); i++) {
                JSONObject data = (JSONObject) dataArray.get(i);
                System.out.println("=======================");
                System.out.println("2016년 : "+data.get("2016년"));
                System.out.println("2017년 : "+data.get("2017년"));
                System.out.println("2018년 : "+data.get("2018년"));
                System.out.println("2019년 : "+data.get("2019년"));
                System.out.println("2020년 : "+data.get("2020년"));
                System.out.println("구분 : "+data.get("구분"));
                System.out.println("차종 : "+data.get("차종"));

                TrafficInfoVO vo = new TrafficInfoVO();

                vo.setY2016(Integer.parseInt(data.get("2016년").toString()));
                vo.setY2017(Integer.parseInt(data.get("2017년").toString()));
                vo.setY2018(Integer.parseInt(data.get("2018년").toString()));
                vo.setY2019(Integer.parseInt(data.get("2019년").toString()));
                vo.setY2020(Integer.parseInt(data.get("2020년").toString()));
                vo.setGubun((String)data.get("구분").toString());
                vo.setCar_gubun((String)data.get("차종").toString());
                
                // mapper.insertTrafficInfo(vo);
            }
        }
        catch(org.json.simple.parser.ParseException pe){
            pe.printStackTrace();
        }
        return "";
    }

    @GetMapping("/api/trafficSCnt")
    public Map<String, Object> getTrafficSInfo(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        TrafficInfoVO vo = service.selectTrafficSCnt();
        resultMap.put("data", vo);
        return resultMap;
    }
    @GetMapping("/api/trafficMCnt")
    public Map<String, Object> getTrafficMInfo(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        TrafficInfoVO vo = service.selectTrafficMCnt();
        resultMap.put("data", vo);
        return resultMap;
    }
    @GetMapping("/api/trafficLCnt")
    public Map<String, Object> getTrafficLInfo(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        TrafficInfoVO vo = service.selectTrafficLCnt();
        resultMap.put("data", vo);
        return resultMap;
    }

    @GetMapping("/api/trafficCar")
    public Map<String, Object> getTrafficCarInfo(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        TrafficCarInfoVO vo = service.selectTrafficCar();
        resultMap.put("data", vo);
        return resultMap;
    }
    
}
