package com.greenart.mapper;

import com.greenart.vo.TrafficInfoVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TrafficInfoMapper {
    public void insertTrafficInfo(TrafficInfoVO vo);
}
