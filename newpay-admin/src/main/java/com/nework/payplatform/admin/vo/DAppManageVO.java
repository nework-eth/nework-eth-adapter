package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dto.DAppManageDTO;
import lombok.Data;

@Data
public class DAppManageVO extends DAppManageDTO {
    private String minWithdrawStr;
    private String maxWithdrawStr;
    private String createdStr;
    private String appStatusStr;
    private String operate;
    private String usableTimeStr;
    private String keyStatusStr;
}