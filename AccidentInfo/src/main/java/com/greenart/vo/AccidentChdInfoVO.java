package com.greenart.vo;

import java.util.Date;

import lombok.Data;

@Data
public class AccidentChdInfoVO {
    private Integer seq;
    private String sido_sgg_nm;
    private String spot_nm;
    private Integer occrrnc_cnt;
    private Integer caslt_cnt;
    private Integer dth_dnv_cnt;
    private Integer se_dnv_cnt;
    private Integer sl_dnv_cnt;
    private Date yearDt;

    private Integer all_caslt_cnt;
    private String str_all_caslt_cnt;

    private Integer all_dth_dnv_cnt;
    private Integer all_se_dnv_cnt;
    private Integer all_sl_dnv_cnt;

    private Integer region_cnt;
    private Integer years_cnt;
    
    private String sido_nm;

    private String yYearDt;
}
