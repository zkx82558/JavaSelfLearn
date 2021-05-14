/**
 * 变量
 * 数据类型：
 *      byte,short,int,long,float,double,char,boolean
 * 定义变量注意：
 *      1、整形默认int，定义Long类型后面要加字母L
 *      2、浮点型默认double，定义float时候后面要加上F
 *      3、注意变量的作用域
 * 使用变量的注意事项：
 *      1、变量未赋值，不能使用
 *      2、变量旨在作用域有效
 *      3、一行可以定义多个变量，但不建议这样
 * 命名规则：
 *      1、不能数字开头 2b
 *      2、不能是关键字
 *      3、严格区分大小写 a和A是不同的
 *      类和接口：首字母大写，多个单词每个首字母大写 HelloWorld
 *      变量和方法：首字母小写，多个单词从第二个单词开始首字母大戏 getName
 *      常量名：所有首字母大写，多个单词用下划线分开 MAX_VALUE
 *      包名：全部小写，多级用.隔开。遵守域名反写的格式,cn.itcast.demo (www.itcast.cn公司官网)
 *      包其实就是文件夹，用来区分同名类
 */
package ch01;

public class variableDemo {
    public static void main(String[] args) {
        //byte
        byte b=10;
        System.out.println(b);

        //short
        short s=20;
        System.out.println(s);

        //int
        int i =30;
        System.out.println(i);

        //long
        long l=10000000000l;
        System.out.println(l);

        //float
        float f=10.3F;
        System.out.println(f);

        //double
        double d=10.23;
        System.out.println(d);

        //char
        char c='a';
        System.out.println(c);

        //boolean
        boolean b1=true;
        System.out.println(b1);

        //赋值
        //代码块,作用域
        {
            int aa = 20; //除了大括号就不能使用了
            System.out.println(aa);
        }
        int bb=1, cc=2; //多行
    }
}
