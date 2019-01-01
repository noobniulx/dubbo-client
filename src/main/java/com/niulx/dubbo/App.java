package com.niulx.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        for (int i = 0; i < 10; i++) {
            Ihello ihello = (Ihello) context.getBean("helloService");
            System.out.println(ihello.sayHello("niulx"));
        }
    }
}