package com.wangwang.yangstudycommon.map;

import java.util.Map;

/**
 * @program: yang-study
 * @description:
 * @author: xuyang
 * @create: 2019-08-19 10:05
 **/
public class MapUtils
{
    public static boolean isNull(Map map)
    {
        return (map == null || map.size() == 0);
    }
}
