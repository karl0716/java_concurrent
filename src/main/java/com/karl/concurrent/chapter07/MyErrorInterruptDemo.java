package com.karl.concurrent.chapter07;

/**
 * 描述:  错误使用
 *
 * @author mh
 * @create 2020-03-24 21:01
 */
public class MyErrorInterruptDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyErrorInterrup());
        thread.start();
        //执行完进行中断处理
        Thread.sleep(100);
        thread.interrupt();
    }
}


class MyErrorInterrup implements Runnable {
    @Override
    public void run() {
        System.out.println("线程开始执行了");

        int i = 0;
        while (i < Integer.MAX_VALUE && !Thread.currentThread().isInterrupted()) {
            i++;
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("最终执行的结果为:" + i);

    }
}