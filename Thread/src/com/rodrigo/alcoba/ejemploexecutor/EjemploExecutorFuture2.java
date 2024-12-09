package com.rodrigo.alcoba.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {


        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> tarea = () -> {
            System.out.println("Inicio de tarea...");
            try {
                System.out.println("Nombre del Thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Fin de tarea...");
            return "Este resultado va a devolver el metodo get()";
        };

        Callable<Integer> tarea2 = () ->{
            System.out.println("Iniciando tarea 2");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultadoFuturo = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);



        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main");

        while(! (resultadoFuturo.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s",
                    resultadoFuturo.isDone()? "finalizó": "en proceso",
                    resultado2.isDone()? "finalizó": "en proceso",
                    resultado3.isDone()? "finalizó": "en proceso"
                    ));
            TimeUnit.MILLISECONDS.sleep(1000);
        }


    }
}
