package com.karl.concurrent.chapter01;

/**
 * 描述:  单例模式 -终极升级版本
 *
 * @author mh
 * @create 2020-03-04 19:57
 */
public class Singleton06 {


    private Singleton06() {

    }

    private static class InstanceHolder {
        private final static Singleton06 singleton = new Singleton06();
    }

    public static Singleton06 getInstance() {
        return InstanceHolder.singleton;
    }


    // 类的静态变量在类的初始化的时候被加载
    // 调用类的静态变量就是对类的主动使用，导致类的初始化
    // 在加载的过程中  也不会重排序
}



