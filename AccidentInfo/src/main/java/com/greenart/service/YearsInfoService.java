package com.greenart.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.greenart.mapper.YearsInfoMapper;
import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
import com.greenart.vo.AccidentOldInfoVO;
import com.greenart.vo.AccidentYearVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YearsInfoService {
    @Autowired
    YearsInfoMapper mapper;

    public List<AccidentOldInfoVO> selectOldYears(){
        return mapper.selectOldYears();
    }
    public List<AccidentChdInfoVO> selectChdYears(){
        return mapper.selectChdYears();
    }
    public List<AccidentBycInfoVO> selectBycYears(){
        return mapper.selectBycYears();
    }

    public List<AccidentYearVO> selectYear(){
        return mapper.selectYear();
    }
}
