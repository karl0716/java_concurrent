package com.karl.concurrent.waitnotify;

import java.util.Random;

/**
 * 描述:  处理类2
 *
 * @author mh
 * @create 2019-11-07 17:15
 */
public class Handle2 extends Thread {
    private MyObject myObject;

    public Handle2(MyObject myObject) {
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
            myObject.decrease();
        }
    }
}