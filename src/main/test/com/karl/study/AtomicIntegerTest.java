package com.karl.study;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 描述:  测试类
 *
 * @author mh
 * @create 2020-03-06 21:15
 */
public class AtomicIntegerTest {


    @Test
    public void test(){
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger.get());
        atomicInteger = new AtomicInteger(10);
        System.out.println(atomicInteger.get());
        atomicInteger.set(12);
        System.out.println(atomicInteger);
        atomicInteger.lazySet(13);
        System.out.println(atomicInteger);

    }

}