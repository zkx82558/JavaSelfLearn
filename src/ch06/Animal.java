package ch06;

/**
 * 抽象类：有抽象方法的类就是抽象类，
 *      只有方法声明，没有方法体；
 *      当定义一个方法却不明确方法的具体实现，可以定义为abstract,具体实现延迟到子类
 *
 * 抽象类的成员特点：
 *      1、可以有普通成员变量，也可以有成员常量
 *      2、可以有抽象方法也可以有普通方法
 *      3、有构造方法，并且构造方法可以重写
 * 抽象类的特点：
 *      1、必须要有abstract;
 *      2、抽象类不能实例化；只能通过子类对象完成
 *      3、抽象类的子类：
 *              如果是普通类就必须重写所有抽象方法
 *              如果是抽象类，就不用重写抽象方法
 *
 *  总结：抽象类中比普通类多一种抽象方法，其他都有
 *  但不能Animal animal = new Animal();
 *
 *  final关键字：
 *          1、final修饰类，该类不能有子类，但可以继承其他类，无儿子有父亲system,string
 *          2、修饰方法，方法不能被重写，不能与abstract共存，父类方法只让子类用，但不让改
 *          3、修饰变量，最终变量就是常量，只能复制一次。
 *                     但不建议修饰引用类型数据，因为地址不变但内部数据可以修改
 *
 *
 */
public abstract class Animal {
    //成员变量值可以改变
    private String name;
    String othername = "Animal";

    //成员常量，值不能改变
    final int AGE= 30;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat(); //抽象方法
    public void call(){
        System.out.println("动物会叫");
    }
}
