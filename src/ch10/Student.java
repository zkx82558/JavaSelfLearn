package ch10;

public class Student {
    public String name;
    private int age;
    public Student(){

    }
    public Student(String name){
        System.out.println("输入的值是："+name);
    }
    private Student (int age){
        System.out.println("输入的年龄是"+age);
    }

    public void show1(){
        System.out.println("我是公共空参方法");
    }
    public void show2(int a){
        System.out.println("我是公共带参方法，传入参数是："+a);
    }
    private int  show3(int a,int b){
        System.out.println("我是私有带参方法");
        return a+b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
