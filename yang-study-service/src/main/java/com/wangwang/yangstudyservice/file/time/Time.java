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

        time = DateUtils.StringToDateByFormat(timeStr, DateUtils.datePattern);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);

//            获取当前日期是不是一号，若是一号则统计前一天的月份。
        String day = DateUtils.DateToStringByFormat(time, DateUtils.datetimeDay);

        if (1 == 1)
        {
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            time = calendar.getTime();
        }

        String month = DateUtils.DateToStringByFormat(time, DateUtils.datePattern);
    }

    public static void main(String[] args)
    {
        timeUtils();

        String flag = "v2019-01-01 18:41".substring(9, 11);
        String month = "v2019-01-01 18:41".substring(1, 8);

        if (flag.equals("01"))
        {
            int curMonth = Integer.valueOf(month.substring(5, 7));
            curMonth -= 1;

            String month6 = month.substring(0, 5);

            StringBuffer monthTemp = new StringBuffer(month6);

            if (curMonth != 0)
            {
                if (curMonth < 10)
                {
                    monthTemp = monthTemp.append(0).append(curMonth);
                }
                else
                {
                    monthTemp = monthTemp.append(curMonth);
                }
                month = monthTemp.toString();
            }
            else
            {

                //跨年解决方案
                int year = Integer.valueOf(month.substring(0, 4));
                StringBuffer lastYearMonth = new StringBuffer().append(year - 1).append("-12");
                month = lastYearMonth.toString();
            }

        }
    }
}

