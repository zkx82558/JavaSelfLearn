/**
 * 关于if语句
 */

package ch02;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("开始执行");
        int a = 10;
        int b = 20;
        if(a==b){
            System.out.println("a==b");
        }else if(a>b){
            System.out.println("a>b");
        }else{
            System.out.println("a<b");
        }
    }
}
