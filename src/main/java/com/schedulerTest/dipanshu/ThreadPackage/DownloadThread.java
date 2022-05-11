package com.schedulerTest.dipanshu.ThreadPackage;

public class DownloadThread extends Thread {

    private boolean requestStop = false;

    @Override
    public void run() {
        while(!requestStop) {
            System.out.println("Downloading ");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void  requestStop() {
        System.out.println(" Requested to stop download Thread ");
         requestStop=true;
    }
}
