/**
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.architect2coder.sofabootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入口controller
 * @author apple
 * @version $Id: GatewayController.java, v 0.1 2020年04月28日 17:52 apple Exp $
 */
@RestController
public class GatewayController {

    @RequestMapping("/")
    public String index(){
        return "hello,spring boot.";
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
}