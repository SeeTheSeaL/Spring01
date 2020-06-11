package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lee
 * @date 2020/6/10 - 9:59 下午
 */
public class Test02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        User user = (User)applicationContext.getBean("user");
        System.out.println(user.toString());
    }
}
