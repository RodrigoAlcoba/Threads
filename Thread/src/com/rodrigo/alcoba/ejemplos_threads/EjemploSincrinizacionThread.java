package com.rodrigo.alcoba.ejemplos_threads;

import com.rodrigo.alcoba.ejemplos_threads.runnable.ImprimirFrases;

public class EjemploSincrinizacionThread {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new ImprimirFrases("Hola ", "que tal")).start();
        new Thread(new ImprimirFrases("¿quien eres ", " tu?")).start();
        try {
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        Thread h3 = new Thread(new ImprimirFrases("Muchas ", "Gracias"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());
    }


    public synchronized static void imprimirFrase(String frase1, String frase2) {
        System.out.print(frase1);
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frase2);
    }
}
