package com.rodrigo.alcoba.ejemplos_threads.threads;

public class NombreThreads extends Thread{

    public NombreThreads(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("se inicia el metodo run del hilo" + getName());

        for (int i= 0; i < 10; i++) {
            System.out.println(this.getName());
        }

        System.out.println("Finaliza el hilo");
    }
}
