package com.greenart.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.service.RegionalInfoService;
import com.greenart.vo.AccidentRegionalVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionalApiController {
    @Autowired
    RegionalInfoService service;

    @GetMapping("api/regionalCnt/{date}")
    public Map<String, Object> getRegionalCnt(
        @PathVariable @Nullable String date
    ){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<AccidentRegionalVO> vo = service.selectRegional(date);
        resultMap.put("regionCnt", vo);
        return resultMap;
    }

    
}
