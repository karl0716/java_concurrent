package com.karl.concurrent.chapter02;

import java.util.stream.IntStream;

/**
 * 描述: 主要是讲wait 和 notify/notifyAll 这个过程中发生了什么
 * 01 通过阅读wait的doc文档可知 每一个对象都是对应的waitSet集合
 * 02 线程被Notify之后不一定立即执行,需要抢到对应的对象的锁
 * 03 线程从waitset中唤醒顺序不一定是FIFO
 * 04 线程被唤醒后 必须重新获取锁。成功获取锁后，继续执行调用之前wait方法之后的代码。
 * @author mh
 * @create 2020-03-04 20:10
 */
public class WaitSet {



    public static void main(String[] args) {

    }
}