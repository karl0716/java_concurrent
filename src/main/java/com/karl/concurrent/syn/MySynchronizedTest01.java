package com.karl.concurrent.syn;

/**
 * 描述:  synchronized 使用案例
 *
 * @author mh
 * @create 2019-11-16 21:46
 */
public class MySynchronizedTest01 {


    public static void main(String[] args) {
        // 场景01 线程01  线程02 对同一个对象进行操作
        // 运行结果：  Hello World
        MyClass myClass = new MyClass();
        Thread thread01 = new Thread(new MyThread01(myClass));
        Thread thread02 = new Thread(new MyThread02(myClass));

        // 场景01 线程01  线程02 分别对不同的对象就行操作
        // 运行结果：  World Hello

//        MyClass myClass01 = new MyClass();
//        MyClass myClass02 = new MyClass();
//        Thread thread01 = new Thread(new MyThread01(myClass01));
//        Thread thread02 = new Thread(new MyThread02(myClass02));

        thread01.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread02.start();
    }

}

class MyClass {
    public synchronized void hello(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }

    public synchronized void world(){
        System.out.println("World");
    }
}


class MyThread01 extends Thread{
    private MyClass myClass;

    public MyThread01(MyClass myClass){
        this.myClass = myClass;
    }

    @Override
    public void run() {
        myClass.hello();
    }
}


class MyThread02 extends Thread{
    private MyClass myClass;

    public MyThread02(MyClass myClass){
        this.myClass = myClass;
    }

    @Override
    public void run() {
        myClass.world();
    }
}