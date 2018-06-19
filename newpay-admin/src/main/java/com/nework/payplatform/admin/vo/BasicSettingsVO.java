package com.nework.payplatform.admin.vo;

import com.nework.payplatform.admin.dao.model.Configuration;
import lombok.Data;

@Data
public class BasicSettingsVO extends Configuration {
    private String valueStr;
    private String createdStr;
    private String updatedStr;
    private String operate;
}
