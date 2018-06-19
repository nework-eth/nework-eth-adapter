package com.nework.payplatform.admin.util;

import com.sun.tools.javac.util.ArrayUtils;
import org.apache.ibatis.reflection.ArrayUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 时间转换工具类
 *
 * @Authro sumz
 * @Email mingzhi@pmcaff.com
 * @Date 2018/4/16
 */
public class DateTimeParseUtils {
    //时间格式
    public static final String format1 = "yyyy-MM-dd";
    public static final String format2 = "yyyy-MM-dd HH:mm:ss";
    public static final String format3 = "HH:mm:ss";
    public static final String format4 = "yyyy-MM-dd HH";
    public static final String format5 = "yyyyMMddHHmmss";
    public static final String format6 = "yyyy年MM月dd日";


    //日期时间正则，对应格式 format2
    private static Pattern pattern = Pattern
            .compile("[1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])\\s+(20|21|22|23|[0-1]\\d):[0-5]\\d:[0-5]\\d");

    /**
     * 匹配时间区间字符串，然后返回Date数组
     *
     * @param datetimeInterval
     * @return
     */
    public static List<Date> getIntervalFromStr(String datetimeInterval) {
        List<Date> dateList = new ArrayList<Date>();
        Matcher matcher = pattern.matcher(datetimeInterval);
        while(matcher.find()){
            dateList.add(convert(matcher.group(0)));
        }
        return dateList;
    }

    /**
     * 字符串转化成日期
     *
     * @param date
     * @return
     */
    public static Date convert(String date) {
        Date retValue = null;
        SimpleDateFormat sdf = new SimpleDateFormat(format2);
        try {
            retValue = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return retValue;
    }


}
