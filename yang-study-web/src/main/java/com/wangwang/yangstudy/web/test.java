package com.wangwang.yangstudy.web;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.annotation.JSONField;
//import com.vipkid.ycb.schedule.domain.request.CommonRequest;

/**
 * @author yangguoliang
 * @Title: Test.java
 * @Package com.vipkid.ycb.schedule.web
 * @Description: (描述该文件做什么)
 * @date 2019年11月17日 下午8:00:45
 */
public class test
{
    public static void main(String[] args)
    {
        //--------取差集
        Set<String> set1 = readFile("/Users/xuyang/onedrive/Study\\&\\&Work/Work/VIPKID/文件/脚本\\&\\&工具/1.txt");
        Set<String> set2 = readFile("/Users/xuyang/onedrive/Study\\&\\&Work/Work/VIPKID/文件/脚本\\&\\&工具/2.txt");
        Set<String> result = new HashSet<String>();
        if (set1.size() > set2.size())
        {
            result.addAll(set1);
            result.removeAll(set2);
        }
        else
        {
            result.addAll(set2);
            result.removeAll(set1);
        }
        String resultFile = "/Users/xuyang/onedrive/Study\\&\\&Work/Work/VIPKID/文件/脚本\\&\\&工具/result.txt";
        writeFile(result, resultFile);
        //过滤重复值

//		Set<String> set2 = readFile("D:/t2");
//		String resultFile = "D:/resultDIS.txt";
//		writeFile(set2, resultFile);
    }

    private static void writeFile(Set<String> result, String resultFile)
    {
        try
        {
            System.out.println("result size:" + result.size());
            File writename = new File(resultFile); // 相对路径，如果没有则要建立一个新的output。txt文件
            writename.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
            for (String string : result)
            {
                out.write(string + "\r\n"); // \r\n即为换行
            }
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static Set<String> readFile(String path)
    {
        Set<String> set1 = new HashSet<String>();
        try
        {
            File file = new File(path);
            if (file.isFile() && file.exists())
            { // 判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), "utf-8");// 考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;

                while ((lineTxt = bufferedReader.readLine()) != null)
                {
                    set1.add(lineTxt.trim());
                }
                bufferedReader.close();
                read.close();
            }
            else
            {
                System.out.println("找不到指定的文件");
            }
        }
        catch (Exception e)
        {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return set1;
    }
}


