package com.karl.concurrent.wait_notify;

import java.util.Random;

/**
 * 描述:  处理类
 *
 * @author mh
 * @create 2019-11-07 17:12
 */
public class Handle1 extends Thread{
    private MyObject myObject;
    public Handle1(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(new Random().nextInt(10) * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myObject.increase();
        }

    }
}