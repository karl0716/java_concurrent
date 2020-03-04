package com.karl.concurrent.chapter01;

/**
 * 描述:  单例模式 - 懒汉模式
 * 线程不安全
 * @author mh
 * @create 2020-03-04 19:06
 */
public class Singleton02 {

    private static Singleton02 instance = null;

    private Singleton02() {

    }

    public static Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }

}