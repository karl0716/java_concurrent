package com.karl.concurrent.syn;

/**
 * 描述:  synchronized 修饰代码块
 *
 * @author karl
 * @create 2020-01-30 13:50
 */
public class MySynchronizedTest04 {
    Object object = new Object();

    public void method() {
        synchronized (object) {
            System.out.println("hello world");
        }
    }
}