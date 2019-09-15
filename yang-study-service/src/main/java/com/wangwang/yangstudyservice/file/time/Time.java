package com.wangwang.yangstudyservice.file.time;

import com.wangwang.yangstudycommon.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

import static org.assertj.core.util.DateUtil.now;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-08-21 20:07
 **/
@Service
@Slf4j
public class Time
{
    public static void timeUtils()
    {

        Date time = now();

        String timeStr = "2019-01-01";

        time = DateUtils.StringToDateByFormat(timeStr,DateUtils.datePattern);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);

//            获取当前日期是不是一号，若是一号则统计前一天的月份。
        String day = DateUtils.DateToStringByFormat(time,DateUtils.datetimeDay);

        if(1 == 1)
        {
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            time = calendar.getTime();
        }

        String month = DateUtils.DateToStringByFormat(time,DateUtils.datePattern);
    }

    public static void main(String[] args)
    {
        timeUtils();
    }

}
