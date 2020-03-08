package com.wangwang.yangstudyservice.file.dataStructure;

import java.util.*;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2020-02-27 15:06
 **/
public class ShowMeBug
{
    //倒叙输出去重
    public static void print(String arr)
    {
        if(arr==null) return;

        String [] helpArr = arr.split("");
        Stack<String> helpStack = new Stack<>();


        LinkedHashMap<String,Integer> helpMap = new LinkedHashMap<>();


        for (int i = 0; i < helpArr.length; i++)
        {
            if(helpMap.containsKey(helpArr[i]))
            {
                int val = helpMap.get(helpArr[i]);
                helpMap.put(helpArr[i],val++);
            }
            else {
                helpMap.put(helpArr[i],1);
            }
        }

        for(Map.Entry<String, Integer> temp:helpMap.entrySet()){

            helpStack.push(temp.getKey());
            System.out.println(temp.getKey()+"("+temp.getValue()+")");

        }

        //倒叙输出
        while(!helpStack.isEmpty())
        {
            System.out.println(helpStack.pop());
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        print("abacgaddbabfcabcfdabcde");
    }
}

