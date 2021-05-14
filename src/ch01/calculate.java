/**
 * 加减乘除
 *      1、注意5/4=1，5.0/4=1.25
 *      2、注意ASCII码：0对应48，a对应97，A对应65
 *      3、自增和自减，++，--
 *          （参与运算时候：++在变量前先自增，
 *                       ++在变量后，先以原值进行其他运算，再自增）
 *      4、赋值运算符：
 *          基本的赋值运算符：=
 *          扩展运算符：+=、-=、*=、/=、%= 可以自动数值类型转换
 *      5、逻辑运算符：&&、||、！
 *      6、三元运算符：关系表达式？表达式1：表达式2，true选择1，false选择2
 */
package ch01;

public class calculate {
    public static void main(String[] args) {
        //注意除法
        System.out.println(5/4); //1
        System.out.println(5/4.0);//1.25

        //字符的加法运算
        int a=10;
        char ch='a'; //97
        System.out.println(a+ch);

        //字符串的加法,按照顺序执行
        System.out.println("hello"+"world"); //helloworld
        System.out.println("hello"+10); //hello10
        System.out.println("hello"+10+20); //hello1020
        System.out.println(10+20+"hello"); //30hello

        //单独使用自增++
        int add = 5;
        add++; //==++add
        System.out.println("add:" + add); //add:6

        //参与运算自增
        int c=5;
        int b = c++;  //先将C原值赋值给b就是5，C再自增，但是如果这里是++c,这里c和b的值都是6
        System.out.println("c:" + c); //6
        System.out.println("b:" + b); //5

        //扩展运算符
        int f = 20;
        f += 20; //f=f =20
        System.out.println("f:" + f);

        //扩展运算符的好处
        short s=2;
//        s=s+1; //报错，应为s+1是一个Int类型的，但s是short数据类型
//        s = (short) (s+1);
        s += 3;
        System.out.println("s:"+s); //这样可以自动数值类型转换，不用强制转换

        //三元运算符
        int i=10;
        int e=20;
        int max = (i >= e) ? i :e;
        System.out.println(max);

    }
}
