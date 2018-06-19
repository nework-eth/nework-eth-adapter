package com.nework.payplatform.admin.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/4/10
 */
@Data
public class DAppManageDTO {
    private Long id;
    private String name;
    private Integer status;
    private String description;
    private BigDecimal minWithdrawNkc;
    private BigDecimal maxWithdrawNkc;
    private String maxGasPrice;
    private String notifyMail;
    private Date created;
    private Date usableTime;
    private String publicKey;
}