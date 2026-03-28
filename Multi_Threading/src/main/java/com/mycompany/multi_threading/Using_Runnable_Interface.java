package com.mycompany.multi_threading;

public class Using_Runnable_Interface implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        Using_Runnable_Interface obj = new Using_Runnable_Interface();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();
    }
}