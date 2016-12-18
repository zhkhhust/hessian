package yjmyzz.cnblogs.com.service.impl;

import yjmyzz.cnblogs.com.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String helloWorld(String message) {
        return "hello," + message;
    }

}