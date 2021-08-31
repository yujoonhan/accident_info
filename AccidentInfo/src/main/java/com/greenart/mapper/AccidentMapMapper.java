package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.AccidentMapVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccidentMapMapper {
    public void insertAccOldMap(AccidentMapVO vo);
    public List<AccidentMapVO> selectOldMap(String region);

    public void insertAccChdMap(AccidentMapVO vo);
    public List<AccidentMapVO> selectChdMap(String region);

    public void insertAccBycMap(AccidentMapVO vo);
    public List<AccidentMapVO> selectBycMap(String region);
}
