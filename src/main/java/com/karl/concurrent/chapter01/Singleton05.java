package com.karl.concurrent.chapter01;

/**
 * 描述:  单例模式-饿汉升级版本 -双次检查的优化
 *
 * @author mh
 * @create 2020-03-04 19:51
 */
public class Singleton05 {


    // 内存的可见性  有序性 禁止重排序

    private static volatile Singleton05 singleton;

    private static Object object = new Object();


    private Singleton05() {

    }

    public static Singleton05 getInstance() {
        if (singleton == null) {
            synchronized (object) {
                if (singleton == null) {
                    singleton = new Singleton05();
                }
            }
        }
        return singleton;
    }
}