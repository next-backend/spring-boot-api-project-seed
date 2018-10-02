package com.conpany.project;

import java.util.concurrent.CountDownLatch;

public class TaskUtil {

    public static void runTask(int num,TaskRunner runnable) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1) ;
        runnable.setCountDownLatch(countDownLatch);
        for (int i = 0; i < num ; i++) {
            new Thread(runnable).start();
        }
        countDownLatch.await();

    }
}
