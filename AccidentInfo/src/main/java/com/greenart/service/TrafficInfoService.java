package com.greenart.service;

import com.greenart.mapper.TrafficInfoMapper;
import com.greenart.vo.TrafficInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrafficInfoService {
    @Autowired
    TrafficInfoMapper mapper;
    public void insertTrafficInfo(TrafficInfoVO vo){
        mapper.insertTrafficInfo(vo);
    }
}
