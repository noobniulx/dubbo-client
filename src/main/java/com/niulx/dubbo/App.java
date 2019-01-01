package com.niulx.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        Ihello ihello = (Ihello) context.getBean("helloService");
        Test test = (Test) context.getBean("test");
        System.out.println(ihello.sayHello("niulx"));
        System.out.println(test.test("hessian"));
    }
}