package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.AccidentOldInfoVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegionalInfoMapper {
    public List<AccidentOldInfoVO> selectOldRegional();
}
