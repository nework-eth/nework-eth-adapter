package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dao.model.Withdraw;
import lombok.Data;

@Data
public class WithdrawVO extends Withdraw {
    private String amountStr;
    private String statusStr;
    private String auditsResultStr;
    private String callbackStatusStr;
    private String createdStr;
    private String lockTimeStr;
    private String operate;
}