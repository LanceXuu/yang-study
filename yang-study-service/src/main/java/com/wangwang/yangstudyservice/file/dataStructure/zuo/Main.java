package com.wangwang.yangstudyservice.file.dataStructure.zuo;

import java.util.Scanner;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2020-03-02 14:58
 **/
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] pre = new int[num];
        int[] mid = new int[num];

        for (int i = 0; i < num; i++)
        {
            pre[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++)
        {
            mid[i] = scanner.nextInt();
        }


    }
}
