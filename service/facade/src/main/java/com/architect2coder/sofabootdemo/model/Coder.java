/**
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.architect2coder.sofabootdemo.model;

import lombok.Data;

/**
 * @author apple
 * @version $Id: Coder.java, v 0.1 2020年05月06日 11:33 apple Exp $
 */
@Data
public class Coder {

    /**
     * id
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 擅长
     */
    private String goodAt;

    /**
     * 年龄
     */
    private int age;

    /**
     * 职位
     */
    private String title;

    /**
     * 公司
     */
    private String company;
}