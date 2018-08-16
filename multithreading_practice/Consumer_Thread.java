package multithreading_practice;

/**
 * Created by sachin on 8/5/2018.
 */
public class Consumer_Thread extends Thread {
    Item_Resource item_resource;

    public Consumer_Thread(Item_Resource item_resource) {
        this.item_resource=item_resource;
    }

    @Override
    public void run() {
        synchronized (this)
        {
            if(item_resource.v.isEmpty()) try {
                System.out.println("CONSUMER HAS TO WAIT AS VECTOR ITEMS IS EMPTY");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            else item_resource.consume();
        }

    }
}
