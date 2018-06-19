package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dao.model.Account;
import lombok.Data;

@Data
public class AccountVO extends Account {
    private String nkcStr;
    private String ethStr;
    private String statusStr;
    private String createdStr;
}
