package com.nework.payplatform.admin.service;

import com.nework.payplatform.admin.dto.TransactionDetailDTO;

import java.util.List;

/**
 * @Author yizhe
 * @Email yizhe@pmcaff.com
 * @Date 2018/6/12
 */
public interface TransactionDetailService {

    List<TransactionDetailDTO> searchTransactionDetail(Long tradeId, Integer status, String source_address,
                                                    String target_address, String createTime, String interval);

    int authoriseCallback(Long id);

}
