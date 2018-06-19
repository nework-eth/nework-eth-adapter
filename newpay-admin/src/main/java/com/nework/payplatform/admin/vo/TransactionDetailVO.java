package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dto.TransactionDetailDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TransactionDetailVO extends TransactionDetailDTO {

    private String createdStr;
    private String valueStr;
    private String callbackStr;
    private String intervalStr;
    private String operate;
}
