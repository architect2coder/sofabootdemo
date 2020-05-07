/**
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.architect2coder.sofabootdemo.service;

import com.architect2coder.sofabootdemo.model.Coder;

/**
 * @author apple
 * @version $Id: HumanResourceService.java, v 0.1 2020年05月06日 15:19 apple Exp $
 */
public interface HumanResourceService {

    /**
     * 获取当前登录的coder信息
     * @return
     */
    Coder getLoginCoder();
}