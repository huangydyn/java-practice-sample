package com.thoughtworks.exercise;

public class EvenOddNumberThreadUsingSync {
    static Number number = new Number();

    public static void main(String[] args) {
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
                synchronized (number) {
                    if (number.n % 2 == 0) {
                        System.out.println("打印偶数:" + number.n);
                        number.n++;
                        number.notify();
                    } else {
                        try {
                            number.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
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
                synchronized (number) {
                    if (number.n % 2 != 0) {
                        System.out.println("打印奇数:" + number.n);
                        number.n++;
                        number.notify();
                    } else {
                        try {
                            number.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
