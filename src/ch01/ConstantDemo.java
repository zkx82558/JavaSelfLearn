package ch01;

/**
 * 常量
 * main方法的快捷键：psvm
 * 输出语句的快捷键：sout
 *
 * 常量：
 *      概述：在程序运行中，指不会发生该表
 *      字符串常量：
 *          1：字符串：“abc"
 *          2:字符：’a'
 *          3、整数：10
 *          4、小数：1.2
 *          5、布尔：true,false
 *          6、空常量：null
 */
public class ConstantDemo {
    public static void main(String[] args) {
        System.out.println("abc");  //这里是字符串常量
        System.out.println("123");

        System.out.println('a');//字符常量
        System.out.println('0');

        System.out.println(10); //整数

        System.out.println(true);//布尔常量
        System.out.println(false);
    }
}
