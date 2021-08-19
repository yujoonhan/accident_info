package com.greenart.service;

import com.greenart.mapper.AccidentMapper;
import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
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
    public void insertAccidentChdInfo(AccidentChdInfoVO vo){
        mapper.insertAccidentChdInfo(vo);
    }
    public void insertAccidentBycInfo(AccidentBycInfoVO vo){
        mapper.insertAccidentBycInfo(vo);
    }
}
