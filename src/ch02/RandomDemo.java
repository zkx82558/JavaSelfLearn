package ch02;


import java.util.Random;

//import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random r=new Random();

        int num=r.nextInt(10); //拿到[0,10)的数字
        System.out.println(num);
    }
}
