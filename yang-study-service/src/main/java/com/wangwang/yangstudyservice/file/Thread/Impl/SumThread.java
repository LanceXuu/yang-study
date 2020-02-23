package com.wangwang.yangstudyservice.file.Thread.Impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-10-24 16:54
 **/
@AllArgsConstructor
@Slf4j
public class SumThread implements Callable<Integer>
{

    private CountDownLatch latch = null;
    private long startId = 0;
    private long endId = 0;
    private long step = 20;

    @Override
    public Integer call()
    {
        int loop = 0;
        try
        {
            int num = 0;
            while (startId < endId)
            {
                num += 1;

                loop++;

                log.info("loop value = {}", loop);
                log.info("start id = {}", startId);

                if (startId + step > endId)
                {
                    log.info("end id = {}", endId);
                }else
                {
                    log.info("end id = {}", startId + step);
                }
                startId += step;

                calculate();


            }

            latch.countDown();


        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            latch.countDown();
        }


        return 1;
    }

    public void calculate()
    {
        log.info("进入计算方法");
    }

}
