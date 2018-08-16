package multithreading_practice;

/**
 * Created by sachin on 8/5/2018.
 */
public class Producer_Thread extends Thread {
    Item_Resource item_resource;
    public Producer_Thread(Item_Resource item_resource) {
        this.item_resource=item_resource;
    }

    @Override
    public void run() {
        synchronized (this)
        {
            if(item_resource.v.isEmpty()) System.out.println("WE ARE NOTIFYING YOU NOW THAT NOW YOU CAN CONSUME");
            item_resource.produce();
            this.notify();

        }

    }
}
