package multithreading_practice;

/**
 * Created by sachin on 8/5/2018.
 */
public class IPC extends Thread {
    static int sum=0;
    public static void main(String[] args) throws InterruptedException {
        IPC i=new IPC();
        i.start();
       // i.wait();//illegal monitor state exception
        //i.join();//illegal monitor state exception
        //i.sleep(100);//making main thread to sleep,it will give 45 as output making child thread completes
        System.out.println(sum);//without sleep MT output is mainly 0
        Thread.sleep(1000);//this will make program to infinte loop as in synchronized block Child enters
        //otherwise mostly main enters and at wait it releases lock to Child and child gets execeuted and notify it
        //to main thread ....but if main is put to sleep
        synchronized (i)
        {
            i.wait();//mt thread waits and notified as soon as child thread completes
        }System.out.println(sum);

    }

    @Override
    public void run() {
        synchronized (this)
        {
            for (int i = 0; i <10 ; i++) {
                sum+=i;
            }
            this.notify();
        }

        //System.out.println(sum);
    }
}
