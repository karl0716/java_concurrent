package com.karl.concurrent.deadlock;

/**
 * 描述:  死锁的场景
 *
 * @author mh
 * @create 2020-02-11 15:43
 */
public class DeadLockTest {
    private Object object1 = new Object();
    private Object object2 = new Object();

    public static void main(String[] args) {
        DeadLockTest deadLockTest = new DeadLockTest();

        Runnable runnable1 = () -> {
            while (true) {
                deadLockTest.method01();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
        };

        Thread thread01 = new Thread(runnable1, "thread01");

        Runnable runnable2 = () -> {
            while (true) {
                deadLockTest.method02();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
        };
        Thread thread02 = new Thread(runnable2, "thread02");


        thread01.start();
        thread02.start();
    }


    public void method01() {
        synchronized (object1) {
            synchronized (object2) {
                System.out.println("method01 invoked");
            }

        }
    }


    public void method02() {
        synchronized (object2) {
            synchronized (object1) {
                System.out.println("method02 invoked");
            }
        }
    }

}