package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.AccidentYearVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YearsInfoMapper {
    public List<AccidentYearVO> selectYear(String region);

    
}
