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

    // 在这里 可能会导致空指针异常
    //主要的原因如下所示:
    // 1 在new的过程不是原子性的操作
    // 2 创建一个对象的分三步走 01 给singleton04分配内存 02 调用构造方法进行初始化的动作  03 指向内存的分配区域
    // 当03执行完毕后singleton04就不为空了。因为还没初始化 在调用其方法/变量就会导致空指针异常


}