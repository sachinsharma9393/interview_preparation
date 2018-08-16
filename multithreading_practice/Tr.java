package multithreading_practice;

/**
 * Created by sachin on 8/5/2018.
 */
public class Tr extends Thread {
    Resource r;
    String name;

    public Tr(Resource r, String name) {
        this.r=r;
        this.name=name;
    }

    @Override
    public void run() {
       // super.run();
        r.print(name);
    }

}
