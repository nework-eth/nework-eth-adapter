package com.nework.payplatform.admin.util;

import java.math.BigDecimal;

/**
 * 数字币单位转换工具类
 *
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/6/12
 */
public class UnitConvert {


    public static BigDecimal fromWei(String number, UnitConvert.Unit unit) {
        return fromWei(new BigDecimal(number), unit);
    }

    public static BigDecimal fromWei(BigDecimal number, UnitConvert.Unit unit) {
        return number.divide(unit.getWeiFactor());
    }

    public static BigDecimal toWei(String number, UnitConvert.Unit unit) {
        return toWei(new BigDecimal(number), unit);
    }

    public static BigDecimal toWei(BigDecimal number, UnitConvert.Unit unit) {
        return number.multiply(unit.getWeiFactor());
    }

    public static enum Unit {
        WEI("wei", 0),
        KWEI("kwei", 3),
        MWEI("mwei", 6),
        GWEI("gwei", 9),
        SZABO("szabo", 12),
        FINNEY("finney", 15),
        ETHER("ether", 18),
        KETHER("kether", 21),
        METHER("mether", 24),
        GETHER("gether", 27);

        private String name;
        private BigDecimal weiFactor;

        private Unit(String name, int factor) {
            this.name = name;
            this.weiFactor = BigDecimal.TEN.pow(factor);
        }

        public BigDecimal getWeiFactor() {
            return this.weiFactor;
        }

        @Override
        public String toString() {
            return this.name;
        }

        public static UnitConvert.Unit fromString(String name) {
            if (name != null) {
                UnitConvert.Unit[] var1 = values();
                int var2 = var1.length;

                for(int var3 = 0; var3 < var2; ++var3) {
                    UnitConvert.Unit unit = var1[var3];
                    if (name.equalsIgnoreCase(unit.name)) {
                        return unit;
                    }
                }
            }
            return valueOf(name);
        }
    }
}
