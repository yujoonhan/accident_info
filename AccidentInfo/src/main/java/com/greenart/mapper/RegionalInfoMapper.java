package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.AccidentRegionalVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegionalInfoMapper {
    public List<AccidentRegionalVO> selectRegional(String date);

}
