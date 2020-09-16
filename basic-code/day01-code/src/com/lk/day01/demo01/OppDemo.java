package com.lk.day01.demo01;

public class OppDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(25);
        System.out.println("姓名："+person.getName()+" "+"年龄："+person.getAge());
        System.out.println("---------------------------------------------------------");
       Person person1 = new Person("张四",15);
        System.out.println("姓名："+person1.getName()+" "+"年龄："+person1.getAge());
    }
}
