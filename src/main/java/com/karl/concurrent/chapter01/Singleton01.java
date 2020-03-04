package com.karl.concurrent.chapter01;

/**
 * 描述:  单例模式 - 饿汉模式
 * 线程安全
 * @author mh
 * @create 2020-03-04 19:02
 */
public class Singleton01 {

    private static final Singleton01 instance = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return instance;
    }
}