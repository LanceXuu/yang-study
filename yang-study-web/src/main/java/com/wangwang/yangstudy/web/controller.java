package com.wangwang.yangstudy.web;

import com.wangwang.yangstudyservice.file.time.Time;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-08-21 20:28
 **/
@Controller
@RequestMapping("/lance")
@Slf4j
public class controller
{
    @GetMapping(value = "/test")
    public void test()
    {
        Time.timeUtils();
    }啊
}
