package com.kim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMain {

    public static void main(String[] args) {

        Connection conn = null;

        try {
            conn = DBConnection.getConnection();
        } finally {
        }
        CRUDClass crudClass =  new CRUDClass();
    }
}





