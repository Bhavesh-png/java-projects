package com.mycompany.multi_threading;

class MyThread extends Thread {

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread Running: " + i);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Simple_Code_Using_Thread_Class {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}