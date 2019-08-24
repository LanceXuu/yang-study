package com.wangwang.yangstudyservice.file;


import com.wangwang.yangstudyservice.file.dto.FilePropertyDTO;

import java.io.*;
import java.util.ArrayList;

import static com.wangwang.yangstudyservice.file.FileProcess.writeFile;

/**
 * @program: replace
 * @description: 用来获取所需要字段
 * @author: xuyang
 * @create: 2019-07-24 16:45
 **/
public class GetTxt
{

    public static String targetTable;

    public static void getTxt(FilePropertyDTO FilePropertyDTO, String[] outMutilFile) throws IOException
    {

        //读取文件
        FileReader fileReader = new FileReader(FilePropertyDTO.getFromFile());

        //读取文本
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //定义每行的输入，定义列表存储每行输入
        String lines;
        ArrayList<String> list = new ArrayList<String>();

        //逐行读取
        while ((lines = bufferedReader.readLine()) != null)
        {
            list.add(lines);
        }
        bufferedReader.close();

        //循环遍历列表，提取表名。
        writeFile(list, outMutilFile);
        return;
    }


}
