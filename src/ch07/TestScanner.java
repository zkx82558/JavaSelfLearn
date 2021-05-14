package ch07;

import java.util.Scanner;

/**
 * 成员方法：Scanner()相关方法
 *      hasNextXXX(): 判断下一个输入项，Xxx可能是任意数据类型
 *      nextXXX()   获得下一个输入项目，返回对应类型数据
 *      String nextLine(): 获得下一行数据，以换行符作为分隔符
 *      String next()：获得下一个输入项，以空白字符作为分隔符
 *                      空白字符：空格,tab,回车
 *
 * 注意最常用nextInt();nextLine()
 */

public class TestScanner {
    public static void main(String[] args) {
        //system.in是一个标准的输入流，默认指向键盘监听键盘操作
        Scanner sc = new Scanner(System.in);

        //接受整数
        System.out.println("请输入整数");
        if(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println("num:"+num);
        }
        //nextInt()方法是只读取了数字，没有读取\n，
        // 这个遗留下来的\n被后面的nextLine()读取到了所以才出现这个方法被跳过的假象。
        sc.nextLine(); //接受默认/n
        //接受字符串类型1
        System.out.println("请输入一个字符串：");
        String str1 = sc.nextLine(); //结束标记换行符,回车1
        System.out.println("str1:"+str1);

        String str2 = sc.next(); //结束标记是空白字符
        System.out.println("str2:"+str2);



    }

}
