package com.romaniuk.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Datasource {

    private static final String DB_NAME = "javadb";
    private static final String CONNECTION_STRING ="jdbc:mysql://localhost:3306/"+DB_NAME+"?autoReconnect=true&useSSL=false";
    private static final String USER="root";
    private static final String PASSWORD="Sasanka01";
    private static final String TABLE_CONTACTS = "contacts";
    private static final String COLUMN_NAME="name";
    private static final String COLUMN_PHONE="phone";
    private static final String COLUMN_EMAIL="email";

    String user = "root";
    String password = "Sasanka01";

    private Connection myConn;

    public boolean open(){
        try {
            Connection myConn = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD);
            //Statement statement = myConn.createStatement();
            System.out.println("Connected");
            return true;
        }catch (SQLException e){
            System.out.println("Could not connect to database" + e.getMessage());
            return false;
        }
    }

    public void close(){
        try {
            if (myConn!=null){
                myConn.close();
            }
        }catch (SQLException e){
            System.out.println("Could not close connection" + e.getMessage());
        }
    }
}
