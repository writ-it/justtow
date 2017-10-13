package com.test;

public class MyTest {
    public static void main(String args[]){
        System.out.print(wzj.name);
        String className="person";
        try {
//            Class student=Class.forName("Person");
//            student.newInstance();
//            student.getName();
            Person person =new Person();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class wzj{
    public static  String name="hello  one";
    static {
        System.out.println("我是一个静态代码块");
    }
    public  wzj(){
        System.out.print("我是一个构造方法");
    }
}
