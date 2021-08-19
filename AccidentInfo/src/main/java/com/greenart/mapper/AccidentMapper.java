package com.greenart.mapper;

import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
import com.greenart.vo.AccidentOldInfoVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccidentMapper {
    public void insertAccidentOldInfo(AccidentOldInfoVO vo);
    public void insertAccidentChdInfo(AccidentChdInfoVO vo);
    public void insertAccidentBycInfo(AccidentBycInfoVO vo);
}
