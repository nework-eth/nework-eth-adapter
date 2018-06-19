package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dto.CashAuditsWithdrawDTO;
import lombok.Data;

@Data
public class CashAuditsWithdrawVO extends CashAuditsWithdrawDTO {
    private String amountStr;
    private String createdStr;
    private String auditsResultStr;
    private String operate;
}