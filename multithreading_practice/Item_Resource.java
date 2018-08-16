package multithreading_practice;

import java.util.Vector;

/**
 * Created by sachin on 8/6/2018.
 */
public class Item_Resource {
    Vector<Integer>v=new Vector<>();


    public void produce() {
        System.out.println("PRODUCING");
        v.add(100);
        System.out.println(v);
    }

    public void consume() {
        System.out.println("consuming");
        v.remove(0);
        System.out.println(v);
    }
}
