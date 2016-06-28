package com.example.java8.interfaces;

/**
 * Created by Oro on 6/26/2016.
 */
public class UseSimpleInterface {

    public static void main(String[] args) {

        //without parameter
        SimpleInterface obj = () -> System.out.println("Say something");
        obj.doSomething();

        //with parameter
        SimpleInterfaceWithArgs obj2 = (v1, v2) -> {

            int result = v1 * v2;
            System.out.println("The result is:" + result);
        };

        Runnable r1 = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("Thread 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable r2 = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("Thread 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
