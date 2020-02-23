package com.wangwang.yangstudyservice.file.Thread.Impl;

import org.assertj.core.util.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-10-24 17:42
 **/
public class SumService
{
    public void sum()
    {
        long startId = 0;
        long maxId = 10000;
        long stepLength = maxId / 8;
        //创建计数器
        //构造参数传入的数量值代表的是latch.countDown()调用的次数
        int threadCount = 0;
        if (maxId % 8 == 0)
        {
            threadCount = 8;
        }
        else
        {
            threadCount = 8 + 1;
        }
        CountDownLatch latch = new CountDownLatch(threadCount);
        List<Callable<Integer>> tasks = new ArrayList<>();
        //创建线程池，可以通过以下方式创建
        ExecutorService threadPool = Executors.newFixedThreadPool(threadCount);

        for (int i = 0; i <= threadCount - 1; i++)
        {
            long start = startId + i * stepLength;
            long end = 0;
            //将子线程添加进线程池执行
            if (i == threadCount - 1)
            {
                end = maxId;
            }
            else
            {
                end = startId + (i + 1) * stepLength;
            }
            Callable<Integer> qfe = new SumThread(latch, start, end,20);
            tasks.add(qfe);
        }

        try
        {
            List<Future<Integer>> futures = threadPool.invokeAll(tasks);
            latch.await();
        }catch (Exception e){e.printStackTrace();}

        finally
        {
            latch.countDown();
        }
    }

    public static void main(String[] args)
    {
        SumService sumService = new SumService();
        sumService.sum();
    }
}
