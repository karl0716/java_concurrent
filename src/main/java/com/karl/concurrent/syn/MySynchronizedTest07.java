package com.karl.concurrent.syn;

/**
 * 描述:  锁粒度演示
 *
 * @author karl
 * @create 2020-02-11pw 14:38
 */
public class MySynchronizedTest07 {

    public void method() {
        Object object = new Object();
        synchronized (object) {
            System.out.println("hello  world");
        }
    }

}