package multithreading_practice;

/**
 * Created by sachin on 8/5/2018.
 */
public class Sync_test {
    public static void main(String[] args) {
        Resource r=new Resource();
        Tr t=new Tr(r,"sa");
        t.start();
        Tr tm=new Tr(r,"na");
        tm.start();
        //got mixed output till we have not applied synchronize keyword to resources method
    }
}
