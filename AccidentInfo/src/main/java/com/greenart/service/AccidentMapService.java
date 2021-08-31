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

    public void insertAccChdMap(AccidentMapVO vo){
        mapper.insertAccChdMap(vo);
    }
    public List<AccidentMapVO> selectChdMap(String region) {
        return mapper.selectChdMap(region);
    }

    public void insertAccBycMap(AccidentMapVO vo){
        mapper.insertAccBycMap(vo);
    }
    public List<AccidentMapVO> selectBycMap(String region) {
        return mapper.selectBycMap(region);
    }
}
