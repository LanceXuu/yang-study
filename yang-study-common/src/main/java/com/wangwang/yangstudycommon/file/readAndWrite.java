package com.wangwang.yangstudycommon.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: yang-study
 * @description: 读写操作
 * @author: xuyang
 * @create: 2019-09-13 18:26
 **/
public class readAndWrite
{
    /** 
    * @Description: 将list写入到文件 
    * @Param:  
    * @return:  
    * @Author: xuyang 
    * @Date: 2019/9/13 
    */ 
    public static void writeFileContext(List<String> strings, String path) throws Exception
    {
        File file = new File(path);

        //如果没有文件就创建
        if (!file.isFile())
        {
            file.createNewFile();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(path));

        for (String l : strings)
        {
            writer.write(l + "\r\n");
        }
        writer.close();

    }


    /** 
    * @Description: 从文件获取内容存储为list 
    * @Param:  
    * @return:  
    * @Author: xuyang 
    * @Date: 2019/9/13 
    */ 
    public static List<String> getFileContent(String path)
    {
        List<String> strList = new ArrayList<String>();
        File file = new File(path);
        InputStreamReader read = null;
        BufferedReader reader = null;
        try
        {
            read = new InputStreamReader(new FileInputStream(file), "utf-8");
            reader = new BufferedReader(read);
            String line;
            while ((line = reader.readLine()) != null)
            {
                strList.add(line);
            }
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (read != null)
            {
                try
                {
                    read.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (reader != null)
            {
                try
                {
                    reader.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

        }
        return strList;
    }

}
