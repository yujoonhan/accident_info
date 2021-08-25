package com.greenart.api;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    @GetMapping("api/yearCnt")
    public Map<String, Object> getYearCnt(
    ){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();

        List<AccidentYearVO> vo = service.selectYear();
        resultMap.put("yearCnt", vo);
        return resultMap;
    }

}
