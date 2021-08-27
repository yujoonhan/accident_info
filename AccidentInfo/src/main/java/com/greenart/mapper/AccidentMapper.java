package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.AccidentAllInfoVO;
import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
import com.greenart.vo.AccidentOldInfoVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccidentMapper {
    public void insertAccidentOldInfo(AccidentOldInfoVO vo);
    public void insertAccidentChdInfo(AccidentChdInfoVO vo);
    public void insertAccidentBycInfo(AccidentBycInfoVO vo);

    public AccidentOldInfoVO selectAcdOldAllYearCnt(String date);
    public AccidentChdInfoVO selectAcdChdAllYearCnt(String date);
    public AccidentBycInfoVO selectAcdBycAllYearCnt(String date);
    
    public AccidentOldInfoVO selectAcdOldDthCnt(String date);
    public AccidentChdInfoVO selectAcdChdDthCnt(String date);
    public AccidentBycInfoVO selectAcdBycDthCnt(String date);

    public List<AccidentAllInfoVO> selectAllCntYear();
    public List<AccidentAllInfoVO> selectAllCntRegion();

}
