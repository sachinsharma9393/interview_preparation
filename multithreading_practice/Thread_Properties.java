package multithreading_practice;

/**
 * Created by sachin on 8/5/2018.
 */
public class Thread_Properties extends Thread{

    String name;
    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        super.run();

    }

    Thread_Properties(String name)
    {
        this.name=name;
        this.setName(name);
        this.setPriority(8);


    }

    public static void main(String[] args) {
     Thread_Properties y=new Thread_Properties("sachin");
        System.out.println("NAME OF THREAD :"+y.getName());
        System.out.println("PRIORITY: "+y.getPriority());
        System.out.println("THREAD GROUP :"+y.getThreadGroup());
        System.out.println("ID IS "+y.getId());
        System.out.println("STATE IS "+y.getState());

    }
}
