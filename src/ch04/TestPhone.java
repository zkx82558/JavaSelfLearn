package ch04;

import java.sql.SQLOutput;

/**
 * 手机类的测试
 *
 * 局部变量： public void call()
 *      方法的参数列表或者方法体中的参数
 *      没有初始值，必须要给定
 *      栈内存中：随着方法的调用而存在，随着方法调用完毕而消失
 * 成员变量： public class
 *      类中，方法外
 *      有默认初始值
 *      堆内存：随着对象的创建而存在，随着对象的消失而消失
 * Java中使用变量规则：
 *      1、使用就近原则，如果局部有将就用，
 *      2、如果没有就去类成员位置找，有就使用，没有就报错
 *
 * Java中的封装体：
 *      方法和类：
 *          1、安全性
 *          2、复用性
 *          3、简单化
 *      通过对象实现类中数据的访问，这是标准JavaBean类
 * private:
 *      私有的意思，成员访问权限
 *      被修饰的成员只能本类中访问
 *      Public一般修饰成员方法，private一般修饰成员变量
 */
public class TestPhone {
    public static void main(String[] args) {
        //1、创建对象
        Phone p = new Phone();

        //调用成员变量：
        p.brand = "苹果";
        p.model = "x";
        System.out.println(p.brand);
        System.out.println(p.model);

        //调用方法
        p.call();
        p.sendMessage();

        //设置值
        p.setAge(23);
        //获取值
        System.out.println(p.getAge());
        p.study();
        p.show();

        Phone p2 = new Phone("xu",30);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
    }
}
