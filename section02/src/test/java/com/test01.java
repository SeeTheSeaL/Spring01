package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author lee
 * @date 2020/5/31 - 11:51 上午
 */
public class test01 {
    public static void main(String[] args){
        String ClassPath = "bean1.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(ClassPath);
        Hello hello = (Hello)applicationContext.getBean("hello");
        System.out.println(hello.getStr());
    }
}
