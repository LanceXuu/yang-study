package com.wangwang.yangstudyservice.file.Thread.Impl;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-10-24 11:55
 **/
public class ThreadPoolExecutorTestImpl
{
    public static void main(String[] args) throws InterruptedException
    {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++)
        {
            try
            {
                Thread.sleep(1000);
            }catch (Exception e){e.printStackTrace();}

        executorService.execute(() ->

            System.out.println("run....")

        );

            countDownLatch.countDown();
        }
        countDownLatch.await();
        executorService.shutdown();

    }

//    public static void main(String[] args)
//    {
//        CountDownLatch countDownLatch = new CountDownLatch(10);
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 10; i++)
//        {
//            try
//            {
//                Thread.sleep(1000);
//            }catch (Exception e){e.printStackTrace();}
//
//        executorService.execute(() ->
//
//            System.out.println("run....")
//
//        );
//
//        }
//        executorService.shutdown();
//
//    }
}
