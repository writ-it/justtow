package com.test;

public class Person {
    private int id;
    private String name;

    static {
        System.out.print("hello world !!!!!");
    }

    public  Person(){
        System.out.print("hello  person");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
