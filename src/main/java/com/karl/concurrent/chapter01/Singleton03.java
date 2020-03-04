package com.karl.concurrent.chapter01;

/**
 * 描述:  单例模式 - 懒汉模式的升级版本 - 加锁  性能比较低
 * 线程安全
 *
 * @author mh
 * @create 2020-03-04 19:11
 */
public class Singleton03 {

    private static Singleton03 singleton03;

    private static Object object = new Object();


    private Singleton03() {

    }

    public static Singleton03 getInstance() {
        synchronized (object) {
            if (singleton03 == null) {
                singleton03 = new Singleton03();
            }
        }
        return Singleton03.singleton03;
    }

}