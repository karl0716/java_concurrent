package com.karl.concurrent.syn;

/**
 * 描述:  synchronized 修饰静态方法
 *
 * @author karl
 * @create 2020-01-30 19:00
 */
public class MySynchronizedTest06 {

    public synchronized static void method() {
        System.out.println("hello world");
    }
}