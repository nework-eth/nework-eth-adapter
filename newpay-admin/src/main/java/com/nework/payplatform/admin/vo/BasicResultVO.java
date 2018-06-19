package com.nework.payplatform.admin.vo;

import lombok.Data;

@Data
public class BasicResultVO {
    private int status;
    private String info;

    public BasicResultVO(int status, String info) {
        this.info = info;
        this.status = status;
    }
}