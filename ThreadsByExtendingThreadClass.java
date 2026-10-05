class MyThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My Cooking Thread is running.");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My Chatting Thread is running.");
        }
    }
}

public class ThreadsByExtendingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

/*
 * CONCURRANCY VS PARALLELISM :
 * 
 * CONCURRANCY: -
 * 1. At a time single task.
 * 2. Requires single core cpu.
 * 
 * PARALLELISM: -
 * 1. At a time multi task.
 * 2. Requires multi core cpu.
 */