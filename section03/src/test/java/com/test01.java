package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lee
 * @date 2020/6/5 - 10:28 下午
 */
public class test01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User name = (User)applicationContext.getBean("user");
        name.show();

    }
}
