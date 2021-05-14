package ch11;

public class Demo {
    public static void main(String[] args) {
        //1、创建方法1
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();

        //2、创建方法二
        MyRunnable mr = new MyRunnable(); //创建一个参数对象
        //创建了一个线程对象，并把参数传递给这个线程
        //在线程启动后，执行额就是参数里面的run方法
        Thread th = new Thread(mr);
        //开启线程
        th.start();
    }
}
