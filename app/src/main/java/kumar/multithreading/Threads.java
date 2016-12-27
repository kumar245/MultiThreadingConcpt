package kumar.multithreading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Threads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threads);


    }

    public static void main(String[] args) {

        //Create a thread using a class that implements runnable

        (new Thread(new HelloRunnable())).start();

//Create a thread using a class that extends Thread

        (new HelloThread()).start();
//Create a thread using runnable object

        //Create a runnable object

Runnable r1 = new Runnable() {
    @Override
    public void run() {

        //perform some work inside the thread
        System.out.println("Hello from "+
                Thread.currentThread().getName()
                + " NOT USING LAMBDA");
    }
};

        Runnable r2 = () -> System.out.println("Hello from "
                + Thread.currentThread().getName()+" USING LAMBDA "
                + "notation");


          /*Create and start a thread using the first runnable object
          *This thread is also given a name in the arguments */

Thread t1 = new Thread(r1,"Thread t1");

        t1.start();

        Thread t2 =new Thread(r2);
        t2.start();

    }
}
