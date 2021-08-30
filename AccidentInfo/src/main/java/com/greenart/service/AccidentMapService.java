package com.greenart.service;

import java.util.List;

import com.greenart.mapper.AccidentMapMapper;
import com.greenart.vo.AccidentMapVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccidentMapService {
    @Autowired
    AccidentMapMapper mapper;
    public void insertAccOldMap(AccidentMapVO vo){
        mapper.insertAccOldMap(vo);
    }
    public List<AccidentMapVO> selectOldMap(String region) {
        return mapper.selectOldMap(region);
    }
}
