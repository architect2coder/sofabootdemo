/**
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.architect2coder.sofabootdemo.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.architect2coder.sofabootdemo.model.Coder;
import com.architect2coder.sofabootdemo.service.HumanResourceService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入口controller
 * @author apple
 * @version $Id: GatewayController.java, v 0.1 2020年04月28日 17:52 apple Exp $
 */
@RestController
public class GatewayController implements ApplicationContextAware {

    private ApplicationContext context;

    @SofaReference
    private HumanResourceService humanResourceService;

    @RequestMapping("/")
    public Coder index(){
        return this.humanResourceService.getLoginCoder();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/")
    public String create(){
        return "hello,new success.";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/")
    public String delete(){
        return "hello,delete success.";
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/")
    public String update(){
        return "hello,update success.";
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}