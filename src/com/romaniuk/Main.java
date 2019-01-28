package com.romaniuk;

import com.romaniuk.model.Datasource;

import java.sql.*;

public class Main {


    public static void main(String[] args){
        // write your code here

        Datasource datasource = new Datasource();

        if(!datasource.open()){
            System.out.println("Can not open datasource");
            return;
        }
        datasource.close();


//        try {
//            Connection myConn = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD);
//            Statement statement = myConn.createStatement();
//
//            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
//                                    "(" + COLUMN_NAME+" text, " +
//                                            COLUMN_PHONE+" integer, " +
//                                            COLUMN_EMAIL + " text" +
//                                    ")");
//            // with method insertContactsStatement - reduction of duplicated code
//
//            insertContactsStatement(statement,"Pawel",48548755,"email@Email");
//            insertContactsStatement(statement,"John",48548755,"email@Email");
//            insertContactsStatement(statement,"Mark",48548755,"email@Email");
//
//            statement.close();
//            myConn.close();
//
//        } catch (SQLException exc) {
//            System.out.println("Something went wrong "+ exc.getMessage());
//            exc.printStackTrace();
//        }
}


}

