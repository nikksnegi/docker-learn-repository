package com.schedulerTest.dipanshu.ThreadPackage;

public class UIThread extends Thread {

    private boolean requestStop = false;

    @Override
    public void run() {
        while (!requestStop) {
            System.out.println("UI Running ");
            try {
                sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void requestStop() {
        System.out.println("Requested to stop UI thread");
        requestStop = true;
    }

}
