package com.schedulerTest.dipanshu.Worker;

public class Connection {

    private static Connection connection = new Connection();

    private static int connections = 0;


    public Connection() {
    }

    public static Connection getInstance() {
        return connection;
    }
    public void connect() {
//      synchronized (this) {
          connections++;
//      }
        System.out.println("No of connections : "+ connections);
    }

}
