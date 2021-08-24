package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
import com.greenart.vo.AccidentOldInfoVO;
import com.greenart.vo.AccidentYearVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YearsInfoMapper {
    public List<AccidentOldInfoVO> selectOldYears();
    public List<AccidentChdInfoVO> selectChdYears();
    public List<AccidentBycInfoVO> selectBycYears();

    public List<AccidentYearVO> selectYear();
}
