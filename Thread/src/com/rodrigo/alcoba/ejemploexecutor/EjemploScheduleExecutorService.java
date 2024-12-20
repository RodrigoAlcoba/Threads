package com.rodrigo.alcoba.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduleExecutorService {
    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna Tarea Programada");

        executor.schedule( () -> {

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hola mundo tarea");
        },500, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra Tarea Programada");


    }
}
