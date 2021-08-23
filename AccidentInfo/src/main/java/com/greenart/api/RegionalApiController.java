package com.greenart.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.service.RegionalInfoService;
import com.greenart.vo.AccidentOldInfoVO;

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
}
