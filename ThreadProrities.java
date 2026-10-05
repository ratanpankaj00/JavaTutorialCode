class MyThread100 extends Thread {
    public MyThread100(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("ThankU " + this.getName());
    }
}

public class ThreadProrities {

    public static void main(String[] args) {
        // ReadyQueue: T1, T2, T3, T4, T5
        MyThread100 t1 = new MyThread100("Ratan1(most important task)");
        MyThread100 t2 = new MyThread100("Ratan2");
        MyThread100 t3 = new MyThread100("Ratan3");
        MyThread100 t4 = new MyThread100("Ratan4");
        MyThread100 t5 = new MyThread100("Ratan5");
        MyThread100 t6 = new MyThread100("Ratan6");
        t1.setPriority(10);
        t2.setPriority(1);
        t3.setPriority(1);
        t4.setPriority(1);
        t5.setPriority(1);
        t6.setPriority(1);
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

}
