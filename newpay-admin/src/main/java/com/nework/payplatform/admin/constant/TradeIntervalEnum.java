package com.nework.payplatform.admin.constant;

import java.util.Objects;

/**
 * TradeIntervalEnum
 */
public enum TradeIntervalEnum {

    Original_INTERVAL("1", "Original_INTERVAL"), ANOMALOUS_INTERVAL("2", "ANOMALOUS_INTERVAL");

    private final String code;
    private final String description;

    TradeIntervalEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }


    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
