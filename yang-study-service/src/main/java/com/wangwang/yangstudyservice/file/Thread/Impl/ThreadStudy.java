package com.wangwang.yangstudyservice.file.Thread.Impl;

/**
 * @program: yang-study
 * @description: 多线程学习
 * @author: xuyang
 * @create: 2020-02-06 20:34
 **/
public class ThreadStudy
{
    public void longTimeTask()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("non_synchronous_code:" + Thread.currentThread().getName()+" "+ i);
        }
        synchronized (this)
        {
            for (int i = 0; i < 100; i++)
            {
                System.out.println("synchronous_code" + Thread.currentThread().getName()+" "+ i);
            }
        }
    }

    public static void main(String[] args)
    {
        ThreadStudy threadStudy = new ThreadStudy();

        Thread01 thread01 = new Thread01(threadStudy);
        thread01.start();

        Thread02 thread02 = new Thread02(threadStudy);
        thread02.start();
    }
}
