package com.greenart.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.service.RegionalInfoService;
import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
import com.greenart.vo.AccidentOldInfoVO;
import com.greenart.vo.AccidentRegionalVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionalApiController {
    @Autowired
    RegionalInfoService service;

    @GetMapping("api/regionalOld")
    public Map<String, Object> getRegionalOld(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<AccidentOldInfoVO> list = service.selectOldRegional();
        resultMap.put("regionList", list);
        return resultMap;
    }

    @GetMapping("api/regionalChd")
    public Map<String, Object> getRegionalChd(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<AccidentChdInfoVO> list = service.selectChdRegional();
        resultMap.put("regionCList", list);
        return resultMap;
    }

    @GetMapping("api/regionalByc")
    public Map<String, Object> getRegionalByc(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<AccidentBycInfoVO> list = service.selectBycRegional();
        resultMap.put("regionBList", list);
        return resultMap;
    }

    @GetMapping("api/regionalCnt/")
    public Map<String, Object> getRegionalCnt(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        AccidentRegionalVO vo = service.selectRegional();
        resultMap.put("regionCnt", vo);
        return resultMap;
    }
}
