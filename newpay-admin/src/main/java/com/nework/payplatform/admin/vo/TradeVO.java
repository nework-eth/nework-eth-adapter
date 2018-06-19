package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dao.model.Trade;
import lombok.Data;

@Data
public class TradeVO extends Trade {
    private String amountStr;
    private String createdStr;
    private String updatedStr;
    private String lockTimeStr;
    private String operate;
}