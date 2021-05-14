package ch06;

/**
 * static:静态的
 *         1、修饰成员变量，能被本类所有对象共享,一个对象改了，该类下所有的都一起改变
 *         2、修饰方法：
 *              静态方法发中没有对象this，所以不能访问静态对象
 *
 * 接口：接口就是提供同一规范，类与接口之间是实现的关系
 *
 * 接口和类之间的关系：
 *      类与类之间：继承是is a
 *          继承关系，只能单继承不能多继承，但可以多层继承就是可以有孙子
 *      类与接口之间： 实现是like a
 *          实现关系，可以单实现也可以多实现
 *      接口与接口之间：
 *          继承关系，可以单继承，也可以多继承
 *      接口与接口的关系是继承关系，接口 extends 接口1，接口2...
 *
 *     interface 接口名 { }
 *      接口不能实例化，只能通过多态的方式实例化子类对象
 *      接口的子类，如果是抽象类，也可以是普通类（要重写接口中所有抽象方法）
 *
 * 总结：
 *      对于一个类来讲：他的父类（继承的关系）中定义的是共性内容
 *                    他的父接口定义的是扩展内容
 */
public class Test_static {
    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.name="小黑";
        d1.work="写代码";
        d1.selfInterduction();

        Developer d2 = new Developer();
        d2.name="白白";
        d2.work="鼓励师";
        d2.selfInterduction();

        //Developer.DEPARTMENT_NAME = "开发部"; //可以直接共享
        d2.selfInterduction();
        d1.selfInterduction();

        //实例化接口,多态
        Smoking sm = new SmokingClass();
        sm.smoke();

    }
}
