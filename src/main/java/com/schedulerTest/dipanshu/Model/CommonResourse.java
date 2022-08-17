package com.schedulerTest.dipanshu.Model;

public class CommonResourse {

    public static int counter;

    public static  int getCounter() {
        return counter;
    }

    public static    void setCounter(int counter) {
        CommonResourse.counter = counter;
    }
    public static   void incCounter() {
         counter++;
    }
// hello common resourse
}
