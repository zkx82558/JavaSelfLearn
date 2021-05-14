package ch02;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数");
        //接受数据
        int out = sc.nextInt();
        System.out.println("out:" + out);
    }
}
