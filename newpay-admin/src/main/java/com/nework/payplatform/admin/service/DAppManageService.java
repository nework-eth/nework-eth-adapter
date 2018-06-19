package com.nework.payplatform.admin.service;

import com.nework.payplatform.admin.dao.model.Account;
import com.nework.payplatform.admin.dto.DAppManageDTO;

import java.util.List;

/**
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/4/10
 */
public interface DAppManageService {
    /**
     * 查找商户列表
     */
    List<DAppManageDTO> searchDAppManage();

    /**
     * 查找账户列表
     */
    List<Account> searchAccount(Long appId, String address, String nkcInterval, String ethInterval,
                                Integer accountStatus, String createdTime);
}
