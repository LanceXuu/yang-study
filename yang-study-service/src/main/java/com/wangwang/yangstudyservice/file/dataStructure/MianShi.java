package com.wangwang.yangstudyservice.file.dataStructure;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2020-02-25 11:10
 **/
public class MianShi
{

    public static void sort(int [] arr)
    {
        int[] flag = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            flag[arr[i]] += 1;
        }

        for (int i = 0; i < flag.length; i++)
        {
            int temp = 0;

            if(flag[i]!= 0)
            {
                for (int j = 0; j < flag[i]; j++)
                {
                    System.out.println(i);
                }
            }
        }

    }

    public static void print()
    {

    }
    /**
     * a function for exchange the value between two index
     */
    public static void swap(int[] flagArray, int i, int j)
    {
        int temp = flagArray[i];

        flagArray[i] = flagArray[j];
        flagArray[j] = temp;
    }

    public static void main(String[] args)
    {
        int [] k = {0,1,0,4,8,2};
        sort(k);
    }
}
