/**
 * Switch语句
 */
package ch02;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字，表示星期");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            default:
                System.out.println("不认识");
                break; //可以不写
        }
    }
}
