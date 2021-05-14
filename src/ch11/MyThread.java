package ch11;

/**
 * 进程：一个应用程序独立性，动态性，开发性
 * 并行和并发：
 *      并行：在同一时刻，有多个指令在多个CPU上同时执行
 *      并发：在同一时刻，有多个指令在单个CPU上交替执行
 *
 * 线程：属于进程，一个进程有多个线程
 *
 * run()和start()有什么区别：
 *      run:仅仅表示创建对象，用对象去调用，并没有创建线程，封装线程执行的代码
 *      start:启动线程；然后由JVM(虚拟机)调用此线程的run()方法
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        //线程在开启后执行的代码
        //super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开启了"+i);
        }
    }
}
