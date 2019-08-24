package com.wangwang.yangstudyservice.file;

import com.wangwang.yangstudyservice.file.GetTxt;
import com.wangwang.yangstudyservice.file.dto.FilePropertyDTO;

import java.io.IOException;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-08-13 15:41
 **/
public class run
{
    public static void main(String[] args) throws IOException
    {
//        //表的地址
//        String filePath = "D://所有的表.txt";
//        //输入地址改为控制台输入args[0];
//        //输出文件的地址
//        String outFilePath = "";
//
//        //多输出地址
//        String [] outMutilFilePath = new String[5];
//
//        outMutilFilePath[0] = "D://demo01.txt";
//        outMutilFilePath[1] = "D://demo02.txt";
//        outMutilFilePath[2] = "D://demo03.txt";
//
//
//        outMutilFilePath[3] = "D://demo04.txt";
//        outMutilFilePath[4] = "D://demo04.txt";
//
//
//        FilePropertyDTO filePropertyDTO = new FilePropertyDTO();
//
//        filePropertyDTO.setFromFile(filePath);
//        //单个输出文件
//        filePropertyDTO.setToFile(outFilePath);
//        //多个输出文件
//        filePropertyDTO.setToMutilFile(outMutilFilePath);
//
//        GetTxt.getTxt(filePropertyDTO,outMutilFilePath);


        String flag = "v2019-01-01 18:41".substring(9,11);
        String month = "v2019-01-01 18:41".substring(1,8);







        if(flag.equals("01")){

            //为一号统计，月份应该为上月
            int curMonth = Integer.valueOf(month.substring(5,7));
            curMonth -= 1;

            String month6 = month.substring(0,5);

            StringBuffer monthTemp = new StringBuffer(month6);

            if(curMonth!=0)
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
            }else{

                //跨年解决方案
                int year = Integer.valueOf(month.substring(0,4));
                StringBuffer lastYearMonth = new StringBuffer().append(year-1).append("-12");
                month = lastYearMonth.toString();
            }

            // todo
        }
    }


    public static void function()
    {


    }


}
