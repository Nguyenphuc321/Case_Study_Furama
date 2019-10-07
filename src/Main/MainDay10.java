package Main;

import Model.NewCustomer;
import Services.ApplicationRunningInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MainDay10 implements ApplicationRunningInterface {
    public static void main(String[] args) {
        MainDay10 mainDay10 = new MainDay10();
        mainDay10.run();
    }
    public static void runningRequestDay10(){
        NewCustomer customer01 = new NewCustomer("Nguyen Van A",14);
        NewCustomer customer02 = new NewCustomer("Nguyen Van B",18);
        NewCustomer customer03 = new NewCustomer("Nguyen Van C",21);

        Queue<NewCustomer> queueCustomer = new LinkedList<>();
        queueCustomer.add(customer01);
        queueCustomer.add(customer02);
        queueCustomer.add(customer03);
        System.out.println("-----day10------");
        showAllCustomerInQueue(queueCustomer);
    }
    public static void showAllCustomerInQueue(Queue<NewCustomer> customerQueue){
        Iterator i = customerQueue.iterator();
        while (i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }
    @Override
    public void run(){
        runningRequestDay10();
    }
}
