package com.nework.payplatform.admin.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Author yizhe
 * @Email yizhe@pmcaff.com
 * @Date 2018/6/12
 */
@Data
public class TransactionDetailDTO {
    private long id;
    private long tradeId;
    private String blockNumber;
    private String timeStamp;
    private String hash;
    private String nonce;
    private String blockHash;
    private Date created;
    private String contractAddress;
    private String from;
    private String to;
    private String value;
    private int isAlreadyCallApp;
    private String confirmations;
    private String gasPrice;
    private String tradeInterval;
}
