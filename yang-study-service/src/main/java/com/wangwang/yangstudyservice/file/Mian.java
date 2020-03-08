package com.wangwang.yangstudyservice.file;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2020-03-07 16:09
 **/
public class Mian
{
    public static void main(String[] args)
    {
        try
        {
            badMethod();
            System.out.print("A");
        }
        catch (Exception ex)
        {
            System.out.print("B");
        }
        finally
        {
            System.out.print("C");
        }
        System.out.print("D");
    }
    public static void badMethod()
    {
        throw new Error();
    }

    int f(int n)
    {
        if (n == 2 || n == 1) return 1;
        int pre = 1;
        int curr = 1;

        for (int i = 3; i <= n; i++)
        {
            int sum = pre + curr;
            pre = curr;
            curr = sum;
        }
        return curr;
    }

}



