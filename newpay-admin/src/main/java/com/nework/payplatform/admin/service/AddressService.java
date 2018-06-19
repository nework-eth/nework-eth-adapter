package com.nework.payplatform.admin.service;

import com.nework.payplatform.admin.dao.model.Wallet;
import com.nework.payplatform.admin.dto.AddressTradeAndTransferDTO;
import com.nework.payplatform.admin.dto.AddressWalletDTO;

import java.util.List;

/**
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/3/29
 */
public interface AddressService {
    /**
     * 查找地址列表
     */
    List<Wallet> searchAddressTable(String walletAddress, String balanceIntervalStr, Integer sortType, Integer addressStatus,
                                    String createTimeIntervalStr);

    /**
     * 查找地址交易详情
     */
    List<AddressTradeAndTransferDTO> searchAddressTradeDetail(String localAddress, Long id, Long dAppId, String address,
                                                              String balanceInterval, String txType, String createTime,
                                                              String updatedTime, String lockTime);

    /**
     * 查找某地址转账详情
     */
    List<AddressTradeAndTransferDTO> searchAddressTransferDetail(String baseAddress, Long id, String address, String balanceInterval,
                                                                 String txType, String unBindTime);

    /**
     * 查找所有地址转账详情
     */
    List<AddressTradeAndTransferDTO> searchAddressTransferAll(Long id, String fromAddress, String toAddress, String balanceInterval,
                                                              String unBindTime);

    /**
     * 通过ID查找地址
     */
    AddressWalletDTO getAddressWalletByID(Long walletAddress);
}
