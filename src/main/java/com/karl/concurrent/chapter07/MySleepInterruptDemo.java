package com.karl.concurrent.chapter07;

/**
 * 描述:  线程中处于阻塞状态下的中断演示
 *
 * @author mh
 * @create 2020-03-24 20:30
 */
public class MySleepInterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MySleepInterrupt());
        thread.start();
        //执行完进行中断处理
        Thread.sleep(100);
        thread.interrupt();
    }
}


class MySleepInterrupt implements Runnable {
    @Override
    public void run() {
        System.out.println("线程开始执行了");
        try {
            int i = 0;
            while (i < Integer.MAX_VALUE && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            Thread.sleep(1000L);
            System.out.println("最终执行的结果为:" + i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}