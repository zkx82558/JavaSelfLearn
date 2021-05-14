package ch04;

import java.security.PrivateKey;

/**
 * 定义一个标准JavaBean类
 */
public class Student {
    //成员变量全部private
    private String name;
    private int age;

    //无参构造
    public Student(){ }

    //带参构造
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
