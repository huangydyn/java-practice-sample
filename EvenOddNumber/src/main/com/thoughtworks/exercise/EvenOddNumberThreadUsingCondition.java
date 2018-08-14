package com.thoughtworks.exercise;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class EvenOddNumberThreadUsingCondition {

    public static Lock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        Number number = new Number();
        EvenThread evenThread = new EvenThread(number);
        OddThread oddThread = new OddThread(number);
        Thread t1 = new Thread(evenThread);
        Thread t2 = new Thread(oddThread);
        t1.start();
        t2.start();
    }

    static class EvenThread implements Runnable {
        final Number number;

        public EvenThread(Number number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("EvenThread start");

            while (number.n <= 100) {
                if (number.n % 2 == 0) {
                    lock.lock();
                    System.out.println("打印偶数:" + number.n);
                    number.n++;
                    condition.signal();
                } else {
                    try {
                        condition.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class OddThread implements Runnable {
        final Number number;

        public OddThread(Number number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("OddThread start");
            while (number.n <= 100) {
                if ((number.n % 2) != 0) {
                    lock.lock();
                    System.out.println("打印奇数:" + number.n);
                    number.n++;
                    condition.signal();
                } else {
                    try {
                        condition.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
