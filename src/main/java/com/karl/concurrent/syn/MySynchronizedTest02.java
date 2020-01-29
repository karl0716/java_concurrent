package com.karl.concurrent.syn;

/**
 * 描述:  synchronized 使用方式的简单介绍
 *
 * @author mh
 * @create 2019-11-17 14:09
 */
public class MySynchronizedTest02 {

    private Object object = new Object();

    public void sayHello(){
        // synchronized
        synchronized (object){
            System.out.println("Hello");
        }
    }

}