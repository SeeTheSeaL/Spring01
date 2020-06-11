package com;

/**
 * @author lee
 * @date 2020/6/5 - 10:22 下午
 */
public class User {

    private String name;


    public User(String name){
        System.out.println("有参构造方法");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name=" + name);
    }
}
