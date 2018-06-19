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
public class AddressTradeAndTransferDTO {
    private Long tradeId;
    private Long dappId;
    private String address; //外部地址或者转入地址
    private String localAddress; //内部地址或者转出地址
    private String txType;
    private BigInteger amount;
    private Date created;      //分配时间
    private Date updated;      //到账时间
    private Date lockTime;   //回收时间
}