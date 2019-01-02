package com.niulx.dubbo;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        for (int i = 0; i < 10; i++) {
            Ihello ihello = (Ihello) context.getBean("helloService");
            System.out.println(ihello.sayHello("niulx"));
        }

        int defaultPort = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension().getDefaultPort();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(App::sa);

    }


    private static void sa() {
        System.out.println("hello world");
    }
}