package kumar.multithreading;

/**
 * Created by User on 12/27/2016.
 */

public class HelloRunnable  implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from "+Thread.currentThread().getName()+" "
                + "a thread created by "
                + "implementing a Runnable Interface!");
    }
}
