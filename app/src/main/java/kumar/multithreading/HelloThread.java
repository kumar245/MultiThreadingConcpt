package kumar.multithreading;

/**
 * Created by User on 12/27/2016.
 */

public class HelloThread extends Thread  {

public void run(){

    System.out.println("Hello from "+Thread.currentThread().getName()
            + " created by "
            + "extending Thread class!");
}
}
