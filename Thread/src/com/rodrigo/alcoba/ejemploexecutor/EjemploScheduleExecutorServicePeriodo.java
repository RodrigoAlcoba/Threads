package com.rodrigo.alcoba.ejemploexecutor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduleExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna Tarea Programada");
        CountDownLatch count = new CountDownLatch(5);
        executor.scheduleAtFixedRate( () -> {

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                count.countDown();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hola mundo tarea");
        },1000, 2000, TimeUnit.MILLISECONDS);
        //TimeUnit.SECONDS.sleep(10);
        count.await();
        System.out.println("Alguna otra Tarea Programada");

        executor.shutdown();

        
    }
}
