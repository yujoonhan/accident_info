package com.greenart.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.service.YearsInfoService;
import com.greenart.vo.AccidentYearVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YearsAPIController {
    @Autowired
    YearsInfoService service;

    @GetMapping("api/yearCnt/{region}")
    public Map<String, Object> getYearsInfo(
        @PathVariable @Nullable String region
    ){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        region = region + "%";
        List<AccidentYearVO> vo = service.selectYear(region);
        resultMap.put("yearCnt", vo);
        return resultMap;
    }

}
