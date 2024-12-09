package com.rodrigo.alcoba.ejemplos_threads.runnable;

import com.rodrigo.alcoba.ejemplos_threads.EjemploSincrinizacionThread;

public class ImprimirFrases implements Runnable {

    String frase1, frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        EjemploSincrinizacionThread.imprimirFrase(this.frase1, this.frase2);
    }
}
