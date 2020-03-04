package com.karl.concurrent.chapter01;

/**
 * 描述:  单例模式- 饿汉的升级版本 - 双次检查
 * 线程安全
 *
 * @author mh
 * @create 2020-03-04 19:17
 */
public class Singleton04 {

    private static Singleton04 singleton04;

    private static Object object = new Object();


    private Singleton04() {

    }

    public static Singleton04 getInstance() {
        if (singleton04 == null) {
            synchronized (object) {
                if (singleton04 == null) {
                    singleton04 = new Singleton04();
                }
            }
        }
        return Singleton04.singleton04;
    }

}