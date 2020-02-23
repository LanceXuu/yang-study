package com.wangwang.yangstudyservice.file.Thread.Impl;

/**
 * @program: yang-study
 * @description: 线程2
 * @author: xuyang
 * @create: 2020-02-06 20:38
 **/
public class Thread02 extends Thread
{
    private ThreadStudy threadStudy;

    public Thread02(ThreadStudy threadStudy)
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
