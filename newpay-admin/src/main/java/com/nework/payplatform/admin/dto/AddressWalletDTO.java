package com.nework.payplatform.admin.dto;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/3/31
 */
@Data
public class AddressWalletDTO {
    private Long id;
    private String address;
    private BigInteger balance;
    private BigInteger balanceEth;
    private Date addressCreated;
    private String statusStr;
    private Long dappId;
    private Long tradeId;
    private Date tradeCreated;
    private Date unBindTime;

}