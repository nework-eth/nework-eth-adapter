package com.nework.payplatform.admin.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 金额区间转换工具类
 *
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/4/16
 */
public class DecimalIntervalConvert {
    public static List<BigDecimal> getIntervalFromStr(String balanceInterval) {
        List<BigDecimal> decimalList = new ArrayList<BigDecimal>();
        String[] balanceIntervalArr = balanceInterval.split(",");
        BigDecimal balanceMin=new BigDecimal(balanceIntervalArr[0]);
        BigDecimal balanceMax=new BigDecimal(balanceIntervalArr[1]);
        balanceMin=balanceMin.setScale(2, BigDecimal.ROUND_HALF_UP);
        balanceMax=balanceMax.setScale(2, BigDecimal.ROUND_HALF_UP);
        decimalList.add(balanceMin);
        decimalList.add(balanceMax);
        return decimalList;
    }

    /**
     * 金额区间转为数组（以太 to WEI）
     * @param amountInterval  | 以ETH为单位的两个金额连接串
     * @return
     */
    public static String[] getAmountsFromIntervalStr(String amountInterval) {
        String[] amountIntervalArr = amountInterval.split(",");
        String minAmount = UnitConvert.toWei(amountIntervalArr[0], UnitConvert.Unit.ETHER).toBigInteger().toString();
        String maxAmount = UnitConvert.toWei(amountIntervalArr[1], UnitConvert.Unit.ETHER).toBigInteger().toString();
        return new String[]{minAmount, maxAmount};
    }
}
