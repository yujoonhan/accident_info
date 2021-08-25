package com.greenart.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.greenart.mapper.RegionalInfoMapper;
import com.greenart.vo.AccidentRegionalVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionalInfoService {
    @Autowired
    RegionalInfoMapper mapper;

    public List<AccidentRegionalVO> selectRegional(String date){
        return mapper.selectRegional(date);
    }

}
