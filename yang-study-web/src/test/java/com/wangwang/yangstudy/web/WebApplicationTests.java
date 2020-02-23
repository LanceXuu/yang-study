package com.wangwang.yangstudy.web;

//import com.wangwang.yangstudyservice.file.Thread.Impl.ThreadStudyImpl;
import com.wangwang.yangstudyservice.file.Thread.ThreadStudy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests
{
    @Autowired
    ThreadStudy threadStudy;

    @Test
    public void contextLoads()
    {
    }

    @Test
    public void testThread()
    {
        threadStudy.cumulative();
    }

}
