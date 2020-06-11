package com;

/**
 * @author lee
 * @date 2020/6/10 - 9:58 下午
 */
public class User {
    private String name;
    private int age;
    public User(){
    }
    public User(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("构造器注入");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法注入");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
