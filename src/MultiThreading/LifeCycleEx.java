package MultiThreading;
import java.util.*;
import java.lang.*;

public class LifeCycleEx extends Thread{

//    @Override
//    public void run(){
//        System.out.println("RUNNING");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static  void main(String[] args) throws InterruptedException {
        LifeCycleEx lifeCycleEx = new LifeCycleEx();
        System.out.println(lifeCycleEx.getState());
        //lifeCycleEx.start();
        Thread.sleep(1000);
//        System.out.println(lifeCycleEx.getState());
//        lifeCycleEx.join(); // Main thread will wait for this thread to complete its execution and then it will move into another step
        System.out.println(lifeCycleEx.getState());
    }
}
