package com.greenart.service;

import com.greenart.mapper.AccidentMapper;
import com.greenart.vo.AccidentOldInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccidentInfoService {
    @Autowired
    AccidentMapper mapper;
    public void insertAccidentOldInfo(AccidentOldInfoVO vo){
        mapper.insertAccidentOldInfo(vo);
    }
}
