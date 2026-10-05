class myThr1 extends Thread{
public myThr(String name){
    super(name);
}
public void run(){
    int i =34;
    while(i>0){
        System.out.println("My Thread is Running.");
        i--;
    }

}
}

// class myThr2 implements Runnable{
//     public void run(){
//         while(true){
//             System.out.println("My Thread interface is running.");
//         }
//     }
// }



public class ThreadClass {
    public static void main(String[] args) {
        myThr1 t1 = new myThr1("Ratan");
        t1.start();
        System.out.println("The id of t1 thread is: " + t1.getId());
        System.out.println("The id of t1 thread is: " + t1.getName());
        System.out.println("The id of t1 thread is: " + t1.getPriority());
        System.out.println("The id of t1 thread is: " + t1.getClass());

    }
}
