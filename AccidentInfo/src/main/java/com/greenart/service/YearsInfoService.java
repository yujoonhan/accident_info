package com.greenart.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.greenart.mapper.YearsInfoMapper;
import com.greenart.vo.AccidentYearVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YearsInfoService {
    @Autowired
    YearsInfoMapper mapper;

    public List<AccidentYearVO> selectYear(String region){
        return mapper.selectYear(region);
    }

}
