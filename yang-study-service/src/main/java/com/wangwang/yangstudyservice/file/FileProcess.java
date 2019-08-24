package com.wangwang.yangstudyservice.file;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.wangwang.yangstudycommon.map.MapUtils.isNull;

/**
 * @program: yang-study
 * @description: 所需写入内容
 * @author: xuyang
 * @create: 2019-08-13 15:39
 **/
public class FileProcess
{


    public static void write(String file, String [] content,BufferedWriter input)
    {
        try
        {
            input.write("`"+content[0]+"`  int NULL COMMENT '"+content[1]+"' ,");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void writeFile(ArrayList<String> list, String[] outMutilFile) throws IOException
    {

        BufferedWriter input = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(outMutilFile[0], true)));

        fileBuild(outMutilFile[0]);

        for (String singleList : list)
        {
            if (singleList.length() > 1)
            {
                String[] content = singleList.split("&");

                FileProcess.write(outMutilFile[0], content, input);

            }

        }
    }


    /**
    * @Description: 创建文件
    * @Param: [pathName]
    * @return: void
    * @Author: xuyang
    * @Date: 2019/8/13
    */
    private static void fileBuild(String pathName)
    {
        File file = new File(pathName);
        if (!file.exists())
        {
            try
            {
                file.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            Map<String,Object> map = new HashMap<>();
            boolean flag = isNull(map);
        }
    }
}
