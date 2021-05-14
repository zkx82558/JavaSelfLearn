package ch11;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //表示线程启动后执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("第二种方法"+i);
        }
    }
}
