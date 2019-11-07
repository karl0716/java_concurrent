package com.karl.concurrent.wait_notify;

/**
 * 描述:  自定义类
 *
 * @author mh
 * 场景 定义一个类  一个int类的成员变量 默认值为0
 * 类中有两个实例方法a,b，一个方法a对成员变量进行+1 的动作
 * 另外一个对象b对成员变量进行-1 的动作
 * 要求两个线程访问，一个线程访问实例方法a 进行+1动作
 * 另外一个线程访问方法b进行-1动作
 * <p>
 * 输入 0 1 0 1 0 1 0 1
 * @create 2019-11-07 16:54
 */
public class MyObject {
    private int count;


    /**
     * +1 的动作
     */
    public synchronized void increase() {
        if (count == 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(count);
        this.notify();
    }

    /**
     * -1 的动作
     */
    public synchronized void decrease() {
        if (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println(count);
        this.notify();
    }
}