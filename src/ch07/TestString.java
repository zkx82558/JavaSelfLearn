package ch07;

/**
 * String类：
 *      概述：
 *          字符串。每一个字符串对象都是常量。
 *      构造方法：
 *          String(byte[]):构造一个String对象，将指定字节数组中的数据转化为字符串
 *          String(char[]):构造一个String对象，将指定字符数组中的数据转化为字符串
 *      成员方法
 *          boolean equals(String):         判断字符串是否相同，区分大小写
 *          boolean equalsIgnoreCase(String):判断字符串是否相同，不区分大小写
 *          boolean startsWith(String)：     判断是否以指定字符串开头
 *          boolean isEmpty():              判断字符串是否为空
 *
 *          int length():
 *          char charAt(int index):    获得指定位置索引的字符
 *          int indexOf(String):       字符串第一次出现的索引
 *          int LastIndexOf(String)     字符串最后一次出现的索引
 *          String substring(int):      获得指定位置之后的缩影
 *          String substring(int,int):  开头和结尾
 */
public class TestString {
    public static void main(String[] args) {
        //1、构造方法
        //指定字节数组中的数据转化为字符串
        byte[] bys = {97,98,99};
        String s1 = new String(bys);
        System.out.println(s1); //a,b,c

        //指定字符数组中的数据转化为字符串
        char[] chs = {'h','e','l'};
        String s2 = new String(chs);
        System.out.println("s2:"+s2);

        //实际开发中String非常常用，所以可以省去New操作
        String s3 = "abc";

        //2、测试成员方法
        String str1 = "abc";
        String str2 = "ABC";
        boolean b1 = str1.equals(str2);
        System.out.println(b1);
        boolean b2 = str1.equalsIgnoreCase(str2);
        System.out.println(b2);
        boolean b3 = str1.startsWith("a");
        System.out.println(b3);
        boolean b4 = str1.isEmpty();
        System.out.println(b4);

        //其他方法：
        String str = "java 黑马程序员 java";
        int length = str.length();
        System.out.println(length);

        char ch = str.charAt(1);

        int index1 =str.indexOf('a');
        System.out.println(index1);

        String s10 = str.substring(5);
        System.out.println(s10);

        System.out.println(str.substring(5,7));



        //其他功能：
        String test = "abc";
        byte[] bys1 = test.getBytes(); //将字符串转化为字符数组,97,98,99
        for (int i = 0; i < bys1.length; i++) {
            System.out.println(bys1[i]);
        }

        //将字符串转换成字符数组
        char[] chs1 = test.toCharArray();//'a','b','c'

        //将指定字符数据转换成字符串
        String test2 = String.valueOf(123);
        System.out.println(test2+4); //1234
        //但一般会这样用
        String test3 = ""+123; //这样也可以变成字符串

        //将指定字符串替换成新的
        String test4 = "abc abc abc";
        String test5 = test4.replace('b','d');
        System.out.println(test5);

        //切割字符串
        String[] arr = test4.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //去掉字符串两边的空白字符
        String test6 = "   a   b   c   ";
        String test7 = test6.trim();
    }
}
