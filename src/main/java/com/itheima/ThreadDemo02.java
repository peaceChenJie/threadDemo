package com.itheima;

public class ThreadDemo02 implements Runnable{


    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"::::::::"+i);
        }
    }
}
