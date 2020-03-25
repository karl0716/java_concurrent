package com.karl.concurrent.chapter07;

/**
 * 描述:  在实际生产环境中的最佳实际
 *
 * @author mh
 * @create 2020-03-24 21:38
 */
public class RightWayStopThreadInProd {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRightWayStopThreadInProd());
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}

class MyRightWayStopThreadInProd implements Runnable {

    @Override
    public void run() {
        System.out.println("开始执行业务");
        while (true) {
            if(Thread.currentThread().isInterrupted()){
                System.out.println("发生了中断,退出执行");
                break;
            }
            // 模拟在执行的过程中调用其他方法
            this.method();
        }
    }

    private void method() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}