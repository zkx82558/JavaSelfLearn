/**
 * 方法重载：一个类中有多个方法，但是参数列表不同的情况
 */
package ch03;

public class OverloadDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean flag1=compare(a,b);
        System.out.println(flag1);
    }

    //1 定义三个方法
    public static boolean compare(int a, int b) {
        System.out.println("判断两个int数据");
        return a == b;
    }

    public static boolean compare(long a, long b) {
        System.out.println("判断两个long数据");
        return a == b;
    }

    public static boolean compare(double a, double b) {
        System.out.println("判断两个double数据");
        return a == b;
    }
    public static int compare(double a){
        return 10;
    }

}
