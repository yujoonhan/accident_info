package com.greenart.vo;

import java.util.Date;

import lombok.Data;

@Data
public class AccidentJwkInfoVO {
    private Integer seq;
    private String sido_sgg_nm;
    private String spot_nm;
    private Integer occrrnc_cnt;
    private Integer caslt_cnt;
    private Integer dth_dnv_cnt;
    private Integer se_dnv_cnt;
    private Integer sl_dnv_cnt;
    private String yearDt;

    private Integer all_cnt;
}