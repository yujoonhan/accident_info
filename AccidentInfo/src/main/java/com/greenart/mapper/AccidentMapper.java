package com.greenart.mapper;

import com.greenart.vo.AccidentOldInfoVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccidentMapper {
    public void insertAccidentOldInfo(AccidentOldInfoVO vo);
}
