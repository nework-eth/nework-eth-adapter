package com.nework.payplatform.admin.vo;

import lombok.Data;

import java.util.List;

@Data
public class GridManagerResult {
    private String status;
    private long totals;
    private List<?> data;
}
