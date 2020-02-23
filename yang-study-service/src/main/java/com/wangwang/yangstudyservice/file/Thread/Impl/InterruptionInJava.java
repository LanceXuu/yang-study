package com.wangwang.yangstudyservice.file.Thread.Impl;

import com.wangwang.yangstudyservice.file.Thread.ThreadStudy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: yang-study
 * @description: 学习多线程
 * @author: xuyang
 * @create: 2019-10-08 19:54
 **/
@Slf4j
@Service
public class InterruptionInJava implements Runnable
{
    private volatile static boolean on = false;

    public static void main(String[] args) throws InterruptedException
    {
        Thread testThread = new Thread(new InterruptionInJava(), "InterruptionInJava");
        //start thread
        testThread.start();
        Thread.sleep(1000);
        InterruptionInJava.on = true;
        testThread.interrupt();

        System.out.println("main end");

    }

    @Override
    public void run()
    {
        while (!on)
        {
            try
            {
                Thread.sleep(10000000);
            }
            catch (InterruptedException e)
            {
                System.out.println("caught exception right now: " + e);
            }
        }
    }
}



