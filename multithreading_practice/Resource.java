package multithreading_practice;

/**
 * Created by sachin on 8/5/2018.
 */
public class Resource {
    String name;
    synchronized void print(String name)//mixed output without synchronized
    {
      //  this.name=name;

        for (int i = 0; i <5 ; i++) {
            System.out.println("I AM A RESOURCE FOR "+name);
        }
    }
}
