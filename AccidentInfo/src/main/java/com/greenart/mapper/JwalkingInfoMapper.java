package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.AccidentJwkInfoVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JwalkingInfoMapper {
    public void insertAccidentJwkInfo(AccidentJwkInfoVO vo);

    public List<AccidentJwkInfoVO> selectJwkCntYear();
}
