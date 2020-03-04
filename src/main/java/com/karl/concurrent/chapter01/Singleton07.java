package com.karl.concurrent.chapter01;

/**
 * 描述:  单例模式 - 枚举
 *
 * @author mh
 * @create 2020-03-04 20:02
 */
public class Singleton07 {
    private Singleton07() {

    }


    public static Singleton07 getInstance(){
        return Single.INSTANCE.getInstance();
    }

    private enum Single {
        INSTANCE;

        private final Singleton07 singleton07;

        Single() {
            singleton07 = new Singleton07();
        }


        public Singleton07 getInstance() {
            return singleton07;
        }
    }
}