package com.rodrigo.alcoba.ejemplos_threads;

import com.rodrigo.alcoba.ejemplos_threads.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        Runnable threadRunnable = new ViajeTarea("Isla de pascua");
        Thread thread = new Thread(threadRunnable);
        thread.start();

        new Thread(new ViajeTarea("New York")).start();
        new Thread(new ViajeTarea("Miami")).start();
        new Thread(new ViajeTarea("Piriapolis")).start();
    }
}
