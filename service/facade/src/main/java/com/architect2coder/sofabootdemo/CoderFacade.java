/**
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.architect2coder.sofabootdemo;

import com.architect2coder.sofabootdemo.model.Coder;

/**
 * 程序员接口
 * @author apple
 * @version $Id: CoderFacade.java, v 0.1 2020年05月06日 11:32 apple Exp $
 */
public interface CoderFacade {

    /**
     * 根据name查询程序员信息
     * @param name
     * @return
     */
    Coder queryByName(String name);
}