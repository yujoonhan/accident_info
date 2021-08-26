package com.greenart.service;

import java.util.List;

import com.greenart.mapper.JwalkingInfoMapper;
import com.greenart.vo.AccidentJwkInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JwalkingInfoService {
    @Autowired
    JwalkingInfoMapper mapper;

    public void insertAccidentJwkInfo(AccidentJwkInfoVO vo){
        mapper.insertAccidentJwkInfo(vo);
    }

    public List<AccidentJwkInfoVO> selectJwkCntYear(){
        return mapper.selectJwkCntYear();
    }
}
