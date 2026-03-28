package com.mycompany.multi_threading;
import java.util.Random ;
public class Multi_Threading {
        static int i;
        static class ThreadDemo1 extends Thread {
            @Override
            public void run() {
                try {
                    Random random = new Random();
                    int r = random.nextInt(10);
                    System.out.println(r);
                    i = r;
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interupted " + e);
                }
            }
        }

        static class ThreadDemo2 extends Thread {

            @Override
            public void run() {
                try {
                    if (i % 2 == 0) {
                        System.out.println(i * i);
                    }
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread Interupted " + e);
                }
            }
        }

        static class ThreadDemo3 extends Thread {

            @Override
            public void run() {
                try {
                    if (i % 2 != 0) {
                        System.out.println(i * i * i);
                    }
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interupted " + e);
                }
            }
        }

        public static void main(String[] args) {
            ThreadDemo1 T1 = new ThreadDemo1();
            T1.start();
            ThreadDemo2 T2 = new ThreadDemo2();
            T2.start();
            ThreadDemo3 T3 = new ThreadDemo3();
            T3.start();
        }
    }