package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dao.model.Wallet;
import com.nework.payplatform.admin.dto.AddressWalletDTO;
import lombok.Data;

@Data
public class AddressWalletVO extends Wallet {
    private String statusStr;
    private String balanceStr;
    private String balanceEthStr;
    private String addressCreatedStr;
    private String tradeCreatedStr;
    private String unBindTimeStr;
    private String operate;

}