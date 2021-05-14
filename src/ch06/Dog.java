package ch06;

/**
 * 在实际开发中子类一般有两个构造，一个空参构造，一个全参构造访问父类
 */
public class Dog extends Animal{
    String othername = "Dog";
    //alt+enter自动重写方法，点击在Dog上选择第一个

    @Override
    public void eat(){
        System.out.println(getName()+"吃骨头");
    }

    //狗类独有的方法
    public void watch(){
        System.out.println("狗看家");
    }
}
