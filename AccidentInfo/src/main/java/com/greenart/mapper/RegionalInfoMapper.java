package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
import com.greenart.vo.AccidentOldInfoVO;
import com.greenart.vo.AccidentRegionalVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegionalInfoMapper {
    public List<AccidentOldInfoVO> selectOldRegional();
    public List<AccidentChdInfoVO> selectChdRegional();
    public List<AccidentBycInfoVO> selectBycRegional();

    public AccidentRegionalVO selectRegional();
}
