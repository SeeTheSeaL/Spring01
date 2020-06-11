package com;

import java.util.*;

/**
 * @author lee
 * @date 2020/6/10 - 8:58 下午
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private Set<String> games;
    private Map<String,String> card;
    private List<String> hobbies;
    private String wife;
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("设置名字为" + name);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString()+
                ", books=" + Arrays.toString(books) +
                ", games=" + games +
                ", card=" + card +
                ", hobbies=" + hobbies +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }
}
