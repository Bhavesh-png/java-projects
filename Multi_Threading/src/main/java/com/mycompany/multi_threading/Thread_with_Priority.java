package com.mycompany.multi_threading;

class PriorityThread extends Thread {

    @Override
    public void run() {
        System.out.println("Running Thread: " + Thread.currentThread().getName());
    }
}

public class Thread_with_Priority {

    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}