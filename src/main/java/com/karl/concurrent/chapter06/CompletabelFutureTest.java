package com.karl.concurrent.chapter06;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 描述:  CompletableFuture 使用
 *
 * @author mh
 * @create 2020-03-16 09:57
 */
public class CompletabelFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<String> stringFuture = calculateAsync();
        System.out.println(stringFuture.get());
    }



    public static Future<String> calculateAsync(){
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        Executors.newCachedThreadPool().submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            completableFuture.cancel(false);
//            completableFuture.complete("completableFuture");
        });
        return completableFuture;
    }





}