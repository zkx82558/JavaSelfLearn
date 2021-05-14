package ch05;

/**
 * 四大权限修饰符：private<默认（什么都不写）<protected<public
 */
public class Parent {
    //成员变量全部private
    private String name;
    private int age;
    int price = 20;
    //快捷键 alt+insert，快速生成构造方法和getXXX(),setXXX();
    //构造方法选择constructor
    //get选择setter,全选择

    public Parent(String ming) {
        System.out.println("parent类的带参构造"+ming); //parent类的带参构造小黑
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
