package com.wangwang.yangstudyservice.file.Thread.Impl;

/**
 * @program: yang-study
 * @description: 线程1
 * @author: xuyang
 * @create: 2020-02-06 20:37
 **/
public class Thread01 extends Thread
{
    private ThreadStudy threadStudy;

    public Thread01(ThreadStudy threadStudy)
    {
        super();
        this.threadStudy = threadStudy;
    }


    @Override
    public void run()
    {
        super.run();
        threadStudy.longTimeTask();
    }
}
