package ua.com.manko.studyjava8.chap2;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sergej on 01.02.2016.
 */
public class TestThreadLocal {
    public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(()-> new DateFormatter(
            new SimpleDateFormat("dd-MMM-yyyy")
    ));




    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            formatter.set(new DateFormatter());
            Date now = new Date();


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            System.out.println(formatter.toString());
        }
    }


    public static void main(String[] args) throws InterruptedException {



        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate

    }
}
