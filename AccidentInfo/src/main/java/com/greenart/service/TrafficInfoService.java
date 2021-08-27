package com.greenart.service;

import com.greenart.mapper.TrafficInfoMapper;
import com.greenart.vo.TrafficCarInfoVO;
import com.greenart.vo.TrafficInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrafficInfoService {
    @Autowired
    TrafficInfoMapper mapper;

    public TrafficInfoVO selectTrafficSCnt(){
        return mapper.selectTrafficSCnt();
    }
    public TrafficInfoVO selectTrafficMCnt(){
        return mapper.selectTrafficMCnt();
    }
    public TrafficInfoVO selectTrafficLCnt(){
        return mapper.selectTrafficLCnt();
    }

    public TrafficCarInfoVO selectTrafficCar(){
        return mapper.selectTrafficCar();
    }
}
