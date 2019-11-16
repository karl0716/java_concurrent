package com.karl.concurrent.waitnotify;

/**
 * 描述:  测试类
 *
 * @author mh
 * @create 2019-11-07 17:07
 */
public class Mytest01 {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        Thread thread1 = new Handle1(myObject);
        Thread thread2 = new Handle2(myObject);
        thread1.start();
        thread2.start();
    }
}