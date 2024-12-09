package com.rodrigo.alcoba.ejemplosync;

import com.rodrigo.alcoba.ejemplosync.runnable.Consumidor;
import com.rodrigo.alcoba.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {

    public static void main(String[] args) {

        Panaderia p = new Panaderia();

        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
