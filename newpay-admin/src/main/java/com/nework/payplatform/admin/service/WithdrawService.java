package com.nework.payplatform.admin.service;

import com.nework.payplatform.admin.dao.model.Withdraw;
import com.nework.payplatform.admin.dto.AddressTradeAndTransferDTO;

import java.util.List;

/**
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/6/14
 */
public interface WithdrawService {

    /**
     * 查找所有提现记录
     */
    List<Withdraw> searchWithdrawTable(Long dAppId, String appUserId, String fromAddress, String toAddress,
                                       String amountInterval, String createTimeIntervalStr, Integer auditsResult);


    /**
     * 提现审核
     */
    int withdrawAudits(Integer auditsNum, Long withdrawId);

}
