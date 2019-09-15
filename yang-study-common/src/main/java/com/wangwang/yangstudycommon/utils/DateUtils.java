package com.wangwang.yangstudycommon.utils;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-08-22 10:55
 **/
@Data
@NoArgsConstructor
public class DateUtils
{
    private static final Log logger = LogFactory.getLog(DateUtils.class);
    public static final String dateMySQLPattern = "yyyy-MM-dd";
    public static final String datePattern = "yyyy-MM";
    public  static final String datetimeMySQLPattern = "yyyy-MM-dd HH:mm:ss";
    public  static final String datetimeMySQLPattern12 = "yyyy-MM-dd HH:mm";
    public  static final String datetimeDay = "dd";



    public static String DateToStringByFormat(Date date, String formatStr)
    {
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
            return sdf.format(date);
        }
        catch (Throwable var3)
        {
            logger.error(var3.getMessage(), var3);
            return null;
        }
    }

    public static Date StringToDateByFormat(String dateStr, String formatStr)
    {
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
            Date date = sdf.parse(dateStr);
            return date;
        }
        catch (Throwable var4)
        {
            logger.error(var4.getMessage(), var4);
            return null;
        }
    }

    public static Date strMySQLDateToDate(String dateStr)
    {
        return StringToDateByFormat(dateStr, "yyyy-MM-dd");
    }

    public static Date strMySQLDateTimeToDate(String dateStr)
    {
        return StringToDateByFormat(dateStr, "yyyy-MM-dd HH:mm:ss");
    }
}
