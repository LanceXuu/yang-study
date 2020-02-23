package com.wangwang.yangstudyservice.file.java8.Stream;

/**
 * @program: yang-study
 * @description: java 8学习lambda简介
 * @author: xuyang
 * @create: 2019-09-15 22:41
 **/
public class Program
{
    //使用匿名内部类
    comparator comparator = new comparator()
    {
        @Override
        public int compare(int a, int b)
        {
            return a + b;
        }
    };

    //使用lambda表达式
    comparator comparator02 = (a, b) -> (a + b);

}


//使用类继承
class comparatorImpl implements comparator
{
    @Override
    public int compare(int a, int b)
    {
        return a + b;
    }
}

//抽象类
@FunctionalInterface
interface comparator
{
    int compare(int a, int b);
}
