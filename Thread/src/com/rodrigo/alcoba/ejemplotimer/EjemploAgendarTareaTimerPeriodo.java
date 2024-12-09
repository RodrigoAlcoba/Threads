package com.rodrigo.alcoba.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        Toolkit tk = Toolkit.getDefaultToolkit();

        AtomicInteger contadorAtomic = new AtomicInteger(3);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            private int i = contadorAtomic.getAndDecrement();

            @Override
            public void run() {
                if (i>0){
                    tk.beep();
                    System.out.println("Tarea periodica en: " + new Date() + " nombre del Thread:" +
                            Thread.currentThread().getName());
                    i--;
                }else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }

            }
        },0, 10000);

        System.out.println("Agendamos una tarea para 5 segundos más ...");


        System.out.println(tk.getScreenSize());
    }


}
