package com.nework.payplatform.admin.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/3/31
 */
@Data
public class CashAuditsWithdrawDTO {
    private Long id;
    private Long dAppId;
    private Long tradeId;
    private String address;
    private Long amount;
    private Date created;
    private String status;
    private Integer auditsResult;
}