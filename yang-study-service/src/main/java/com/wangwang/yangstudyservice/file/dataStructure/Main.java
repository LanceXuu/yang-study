package com.wangwang.yangstudyservice.file.dataStructure;

import java.util.Scanner;

/**
 * @program: yang-study
 * @description: HUAWEI
 * @author: xuyang
 * @create: 2020-02-23 14:17
 **/
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        boolean flag = false;

        for (int i = 2; i < num; i++)
        {
            if(num%i == 0)
            {
                flag = true;
            }
        }

        String string = flag ? "NO" : "YES";
        System.out.println(string);

        System.out.println(flag ? "NO" : "YES"  );
    }

    public void function (int num)
    {
        if(num <= 3)
        {

        }
    }
}
