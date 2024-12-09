package com.rodrigo.alcoba.ejemplos_threads;

import com.rodrigo.alcoba.ejemplos_threads.threads.NombreThreads;

public class EjemploExtenderThread {
    public static void main(String[] args) {

        Thread hilo = new NombreThreads("Rodrigo Alcoba");
        hilo.start();
        System.out.println(hilo.getState());
    }
}
