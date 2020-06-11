package com;

/**
 * @author lee
 * @date 2020/6/10 - 3:10 下午
 */
public class UserT {

    private String name;

    public UserT(String name){
        System.out.println("创建UserTwo");
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
