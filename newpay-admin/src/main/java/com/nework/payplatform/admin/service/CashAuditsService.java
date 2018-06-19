package com.nework.payplatform.admin.service;

import com.nework.payplatform.admin.dto.CashAuditsWithdrawDTO;

import java.util.List;

/**
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/3/30
 */
public interface CashAuditsService {
    /**
     * 查找需审核提现列表
     */
    List<CashAuditsWithdrawDTO> searchCashAuditsWithdraw(Long appId, Long tradeID, String address, String amountInterval,
                                                         String status, Integer auditsResult, String createTime);
}
