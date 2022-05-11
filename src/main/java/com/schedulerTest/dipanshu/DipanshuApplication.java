package com.schedulerTest.dipanshu;

import com.schedulerTest.dipanshu.Model.CommonResourse;
import com.schedulerTest.dipanshu.ThreadPackage.DownloadThread;
import com.schedulerTest.dipanshu.ThreadPackage.UIThread;
import com.schedulerTest.dipanshu.Worker.Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//   Semaphore semaphore =  new Semaphore(1);
//		   try {
//		   semaphore.acquire();
//		   semaphore.release();
//
//		   } catch (InterruptedException e) {
//		   e.printStackTrace();
//		   }
//		   System.out.println("Aquired semaphore  " +  semaphore.availablePermits());




//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//public class DipanshuApplication {
//
//    public static void main(String[] args) {
//
//		Connection.getInstance().connect();
//        CommonResourse commonResourse = new CommonResourse();
//
//        DownloadThread downloadThread = new DownloadThread();
//        UIThread uiThread = new UIThread();
//
//        downloadThread.start();
//        uiThread.start();
//
//        Thread thread1 = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    CommonResourse.incCounter();
//                }
//                System.out.println( "Thread 1  : "  + CommonResourse.counter);
//            }
//        };
//
//        Thread thread2 = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    CommonResourse.incCounter();
//                }
//                System.out.println( "Thread 2  : " + CommonResourse.counter);
//            }
//
//        };
//
//        thread1.start();
//        thread2.start();
//
//
//        // reqesting stop
//		downloadThread.requestStop();
//		uiThread.requestStop();
//
//		SpringApplication.run(DipanshuApplication.class, args);
//    }

    @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
    public class DipanshuApplication {

        public static void main(String[] args) {
		SpringApplication.run(DipanshuApplication.class, args);
        }
}
