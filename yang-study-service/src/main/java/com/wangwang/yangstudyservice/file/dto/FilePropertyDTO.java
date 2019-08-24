package com.wangwang.yangstudyservice.file.dto;

import lombok.Data;

/**
 * @program: yang-study
 * @description: 文件属性
 * @author: xuyang
 * @create: 2019-08-13 15:31
 **/
@Data
public class FilePropertyDTO
{
    private String fromFile;

    private String toFile;

    private String[] toMutilFile;
}
