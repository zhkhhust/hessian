package yjmyzz.cnblogs.com.service.impl;

import yjmyzz.cnblogs.com.service.FooService;

public class FooServiceImpl implements FooService {

    @Override
    public String foo(String message) {
        return "foo," + message;
    }

}