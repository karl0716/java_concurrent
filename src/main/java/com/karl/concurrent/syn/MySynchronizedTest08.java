package com.karl.concurrent.syn;

/**
 * 描述:  锁粗化
 *
 * @author karl
 * @create 2020-02-11 15:15
 */
public class MySynchronizedTest08 {

    private Object object = new Object();


    public void method() {
        synchronized (object) {
            System.out.println("hello");
        }

        synchronized (object) {
            System.out.println("world");
        }

        synchronized (object) {
            System.out.println("!");
        }
    }
}