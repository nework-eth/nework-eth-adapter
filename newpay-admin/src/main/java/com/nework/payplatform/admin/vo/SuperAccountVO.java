package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dao.model.SuperAccount;
import lombok.Data;

@Data
public class SuperAccountVO extends SuperAccount {
    private String balanceStr;
    private String balanceEthStr;
    private String operate;
}