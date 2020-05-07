/**
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.architect2coder.sofabootdemo;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.architect2coder.sofabootdemo.model.Coder;
import org.springframework.stereotype.Repository;

/**
 * 程序员接口实现
 * @author apple
 * @version $Id: CoderFacadeImpl.java, v 0.1 2020年05月06日 11:49 apple Exp $
 */
@Repository
@SofaService
public class CoderFacadeImpl implements CoderFacade{

    public Coder queryByName(String name) {
        Coder coder = new Coder();
        coder.setName(name);
        System.out.println("Hello, code facade annotation implementation");
        return coder;
    }
}