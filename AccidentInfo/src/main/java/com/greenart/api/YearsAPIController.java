package com.greenart.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.service.YearsInfoService;
import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
import com.greenart.vo.AccidentOldInfoVO;
import com.greenart.vo.AccidentYearVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YearsAPIController {
    @Autowired
    YearsInfoService service;

    @GetMapping("api/yearsOld")
    public Map<String, Object> getYearsOld(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<AccidentOldInfoVO> list = service.selectOldYears();
        resultMap.put("yearOList", list);
        return resultMap;
    }

    @GetMapping("api/yearsChd")
    public Map<String, Object> getYearsChd(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<AccidentChdInfoVO> list = service.selectChdYears();
        resultMap.put("yearCList", list);
        return resultMap;
    }
    @GetMapping("api/yearsByc")
    public Map<String, Object> getYearsByc(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<AccidentBycInfoVO> list = service.selectBycYears();
        resultMap.put("yearBList", list);
        return resultMap;
    }

    @GetMapping("api/yearCnt")
    public Map<String, Object> getYearCnt(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<AccidentYearVO> vo = service.selectYear();
        resultMap.put("yearCnt", vo);
        return resultMap;
    }
}
