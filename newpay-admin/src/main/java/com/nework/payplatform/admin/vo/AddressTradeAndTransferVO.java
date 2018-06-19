package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dto.AddressTradeAndTransferDTO;
import lombok.Data;

@Data
public class AddressTradeAndTransferVO extends AddressTradeAndTransferDTO {
    private String amountStr;
    private String createdStr;
    private String updatedStr;
    private String lockTimeStr;
    private String operate;

}