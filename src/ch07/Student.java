package ch07;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int score;

    public Student() {
    }

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //toString()重写，将对象转成其对应字符串形式
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    //equals()方法，用来比较两个对象是否相同，但在实际开发中，所有属性一样，才认为是同一个对象
/*    public boolean equals(Object obj){  //s1.equals(s2)
        *//*
        this:谁调用，this就表示谁，s1
        obj:s2
        这里必须要向下转型，因为object是父类，所以向下转型才可以使用子类特有成员
         *//*
        Student s2 = (Student) obj;
        return this.id == s2.id;
    }*/

    //快捷键生成
    @Override
    public boolean equals(Object o) {  //s1.equals(s2)
        //this:s1, o:s2
        if (this == o) //比较地址值是否相同，判断是否为同一个对象，如果if语句只有一行代码，{}可以省略
            return true;
        //判断两个对象是否是同一个类型的对象，拿this的字节码和s2的字节码进行比较，看是否都是学生，提高程序的健壮性
        if (o == null || getClass() != o.getClass())  //不是一个对象
            return false;
        Student student = (Student) o; //向下转型
        //走到这里就是要比较的对象不是同一个对象，比较的两个对象是同一个类型的
        return id == student.id &&
                score == student.score &&
                name.equals(student.name); //String也是引用类型，里面也有equals方法
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }
}
