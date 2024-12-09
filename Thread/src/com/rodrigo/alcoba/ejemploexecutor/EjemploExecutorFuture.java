package com.rodrigo.alcoba.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {


        ExecutorService executor = Executors.newSingleThreadExecutor();

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
        Future<?> resultadoFuturo = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main");

        while(!resultadoFuturo.isDone()){
            System.out.println("Ejecutando la tarea...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println("Obtenemos el resultado de la tarea: " + resultadoFuturo.get());
        System.out.println("Finalizó la tarea? " + resultadoFuturo.isDone());


    }
}
