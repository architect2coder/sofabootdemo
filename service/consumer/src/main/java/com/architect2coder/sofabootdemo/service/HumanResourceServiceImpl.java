/**
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.architect2coder.sofabootdemo.service;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.architect2coder.sofabootdemo.CoderFacade;
import com.architect2coder.sofabootdemo.model.Coder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 人力资源服务
 * @author apple
 * @version $Id: HumanResourceServiceImpl.java, v 0.1 2020年05月06日 15:19 apple Exp $
 */
@Service
@SofaService
public class HumanResourceServiceImpl implements HumanResourceService{

    @SofaReference
    private CoderFacade coderFacade;

    /**
     * 获取当前登录的coder信息
     *
     * @return
     */
    public Coder getLoginCoder() {
        return coderFacade.queryByName("apple");
    }
}