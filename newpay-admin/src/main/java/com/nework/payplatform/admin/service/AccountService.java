package com.nework.payplatform.admin.service;

import com.nework.payplatform.admin.dao.model.SuperAccount;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/6/13
 */
public interface AccountService {
    /**
     * 查找超级账户列表
     */
    List<SuperAccount> findSuperAccountTable();

    /**
     * 创建ETH分发请求单据
     * @param balanceNKC
     * @param balanceETH
     * @param amount
     * @return
     */
    long createETHSend(BigDecimal balanceNKC, BigDecimal balanceETH,BigDecimal amount);
}
