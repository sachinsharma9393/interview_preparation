package multithreading_practice;

import OS_PROBLEMS_WITH_MULTITHREADING.producer_consumer_problem.Consumer;

/**
 * Created by sachin on 8/6/2018.
 */
public class Pro_Con_test {
    public static void main(String[] args) throws InterruptedException {
        Item_Resource item_resource=new Item_Resource();
        Producer_Thread p=new Producer_Thread(item_resource);
        Consumer_Thread c=new Consumer_Thread(item_resource);
        Thread.sleep(200);
        p.start();
        c.start();
        System.out.println("PRINTING ITEMS ");
        System.out.println(item_resource.v);
        //there are various possibiliies of output,,but if consume method gets call on empty vector resource
        //then there will be error

    //so as to not call consume method on empty lets wait on it when consume on empty and when item added ,we will notify
        //that consumer thread

    }
}
