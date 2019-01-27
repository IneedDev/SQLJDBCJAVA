package com.romaniuk;

import java.sql.*;

public class Main {
    private static final String DB_NAME = "javadb";
    private static final String CONNECTION_STRING ="jdbc:mysql://localhost:3306/"+DB_NAME+"?autoReconnect=true&useSSL=false";
    private static final String USER="root";
    private static final String PASSWORD="Sasanka01";
    private static final String TABLE_CONTACTS = "contacts";
    private static final String COLUMN_NAME="name";
    private static final String COLUMN_PHONE="phone";
    private static final String COLUMN_EMAIL="email";

    public static void main(String[] args){
        // write your code here

        String user = "root";
        String password = "Sasanka01";
        try {
            Connection myConn = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD);
            Statement statement = myConn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                    "(" + COLUMN_NAME+" text, " +
                                            COLUMN_PHONE+" integer, " +
                                            COLUMN_EMAIL + " text" +
                                    ")");
            // with method insertContactsStatement - reduction of duplicated code

            insertContactsStatement(statement,"Pawel",48548755,"email@Email");
            insertContactsStatement(statement,"John",48548755,"email@Email");
            insertContactsStatement(statement,"Mark",48548755,"email@Email");

            statement.close();
            myConn.close();

        } catch (SQLException exc) {
            System.out.println("Something went wrong "+ exc.getMessage());
            exc.printStackTrace();
        }
    }

    private static void close(Connection myConn, Statement myStmt,
                              ResultSet myRs) throws SQLException {
        if (myRs != null) {
            myRs.close();
        }

        if (myStmt != null) {
            myStmt.close();
        }

        if (myConn != null) {
            myConn.close();
        }
    }

    private static void insertContactsStatement (Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}

