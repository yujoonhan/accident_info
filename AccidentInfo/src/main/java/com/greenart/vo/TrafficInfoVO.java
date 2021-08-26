package com.greenart.vo;

import java.util.Date;

import lombok.Data;

@Data
public class TrafficInfoVO {
    private Integer seq;
    private Integer trafficVolumn;
    private Date sumDate;
}
