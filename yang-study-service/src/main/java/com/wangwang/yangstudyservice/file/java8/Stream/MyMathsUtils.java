package com.wangwang.yangstudyservice.file.java8.Stream;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-08-21 11:20
 **/
public class MyMathsUtils
{
    /**
    * @Description: 将map转换为list--->java 8
    * @Param:
    * @return:
    * @Author: xuyang
    * @Date: 2019/9/15
    */
    public void function()
    {
        Map map = new HashMap<>();
        map.put(1,"1");
        map.put(2,"1");
        map.put(3,"1");
        map.put(4,"1");
        map.put(5,"1");

        //遍历map
        map.forEach((k,v) -> System.out.println("K:V"+k+v));
    }
    
    /** 
    * @Description:   
    * @Param:  
    * @return:  
    * @Author: xuyang 
    * @Date: 2019/9/15 
    */ 
    public void function01(){
        
    }


    public static void main(String[] args)
    {
        MyMathsUtils myMathsUtils = new MyMathsUtils();
        myMathsUtils.function();
    }
}
