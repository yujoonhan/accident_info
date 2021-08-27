package com.greenart.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.greenart.mapper.AccidentMapper;
import com.greenart.vo.AccidentAllInfoVO;
import com.greenart.vo.AccidentBycInfoVO;
import com.greenart.vo.AccidentChdInfoVO;
import com.greenart.vo.AccidentOldInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccidentInfoService {
    @Autowired
    AccidentMapper mapper;
    public void insertAccidentOldInfo(AccidentOldInfoVO vo){
        mapper.insertAccidentOldInfo(vo);
    }
    public void insertAccidentChdInfo(AccidentChdInfoVO vo){
        mapper.insertAccidentChdInfo(vo);
    }
    public void insertAccidentBycInfo(AccidentBycInfoVO vo){
        mapper.insertAccidentBycInfo(vo);
    }


    public AccidentOldInfoVO selectAcdOldAllYearCnt(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String date = formatter.format(now);

        AccidentOldInfoVO data =  mapper.selectAcdOldAllYearCnt(date);
        Integer all_caslt_cnt = data.getAll_caslt_cnt();
        DecimalFormat dFormatter = new DecimalFormat("###,###");
        String str_all_caslt_cnt = dFormatter.format(all_caslt_cnt);

        data.setStr_all_caslt_cnt(str_all_caslt_cnt);;
        return data;
    }
    public AccidentChdInfoVO selectAcdChdRyearCnt(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String date = formatter.format(now);

        AccidentChdInfoVO data =  mapper.selectAcdChdAllYearCnt(date);
        Integer all_caslt_cnt = data.getAll_caslt_cnt();
        DecimalFormat dFormatter = new DecimalFormat("###,###");
        String str_all_caslt_cnt = dFormatter.format(all_caslt_cnt);

        data.setStr_all_caslt_cnt(str_all_caslt_cnt);;
        return data;
    }
    public AccidentBycInfoVO selectAcdBycRyearCnt(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String date = formatter.format(now);

        AccidentBycInfoVO data =  mapper.selectAcdBycAllYearCnt(date);
        Integer all_caslt_cnt = data.getAll_caslt_cnt();
        DecimalFormat dFormatter = new DecimalFormat("###,###");
        String str_all_caslt_cnt = dFormatter.format(all_caslt_cnt);

        data.setStr_all_caslt_cnt(str_all_caslt_cnt);;
        return data;
    }
    
    public AccidentOldInfoVO selectAcdOldDthCnt(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String date = formatter.format(now);
        return mapper.selectAcdOldDthCnt(date);
    }
    public AccidentChdInfoVO selectAcdChdDthCnt(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String date = formatter.format(now);
        return mapper.selectAcdChdDthCnt(date);
    }
    public AccidentBycInfoVO selectAcdBycDthCnt(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String date = formatter.format(now);
        return mapper.selectAcdBycDthCnt(date);
    }

    public List<AccidentAllInfoVO> selectAllCntYear(){
        return mapper.selectAllCntYear();
    }
    public List<AccidentAllInfoVO> selectAllCntRegion(){
        return mapper.selectAllCntRegion();
    }
}
