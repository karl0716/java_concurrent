package com.karl.concurrent.syn;

/**
 * 描述:  多线程对成员变量和局部变量的影响
 *  成员变量多线程共享
 *  局部变量 位于方法区中 每个线程独立 互不影响
 *
 * @author mh
 * @create 2020-01-29 22:03
 */
public class MySynchronizedTest03 {
    public static void main(String[] args) {
        Runnable myThread = new MyThread();


        Thread thread01 = new Thread(myThread);
        Thread thread02 = new Thread(myThread);
        thread01.start();
        thread02.start();
    }
}

class MyThread implements Runnable {

//    int i; 成员变量

    @Override
    public void run() {
        int i = 0; // 局部变量

        while (true) {
            System.out.println("i:" + i++);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 30) {
                break;
            }
        }


    }
}