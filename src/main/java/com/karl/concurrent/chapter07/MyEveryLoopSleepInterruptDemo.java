package com.karl.concurrent.chapter07;

/**
 * 描述:  循环体内含有阻塞
 *
 * @author mh
 * @create 2020-03-24 20:52
 */
public class MyEveryLoopSleepInterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyEveryLoopSleepInterrupt());
        thread.start();
        //执行完进行中断处理
        Thread.sleep(100);
        thread.interrupt();
    }
}


class MyEveryLoopSleepInterrupt implements Runnable {
    @Override
    public void run() {
        System.out.println("线程开始执行了");
        try {
            int i = 0;
            while (i < Integer.MAX_VALUE && !Thread.currentThread().isInterrupted()) {
                i++;
                Thread.sleep(10L);
            }
            System.out.println("最终执行的结果为:" + i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}