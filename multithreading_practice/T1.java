package multithreading_practice;

/**
 * Created by sachin on 8/5/2018.
 */
public class T1 extends Thread {

    public void run()
    {
        System.out.println("CHILD THREAD");
        for (int i = 0; i <5 ; i++) {
            System.out.println("CHILD THREAD " + i);
        }
    }

    public static void main(String[] args) {
        T1 t=new T1();
        t.start();
        for (int i = 0; i <5 ; i++) {
            System.out.println("MAIN THREAD " + i);
        }
    }
}
