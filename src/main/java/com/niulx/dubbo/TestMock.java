package com.niulx.dubbo;

public class TestMock implements Ihello {
    @Override
    public String sayHello(String s) {
        return "系统繁忙";
    }
}
