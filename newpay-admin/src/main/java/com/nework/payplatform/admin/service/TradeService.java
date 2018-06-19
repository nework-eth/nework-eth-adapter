package com.nework.payplatform.admin.service;

import com.nework.payplatform.admin.dao.model.Trade;

import java.util.List;

/**
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/6/14
 */
public interface TradeService {

    /**
     * 查找交易列表
     */
    List<Trade> searchTradeTable(Long dAppId, String address,String tradeNo, String status,String amountInterval,
                                 String createTimeIntervalStr, String updatedTimeIntervalStr, String lockTimeIntervalStr);

}
