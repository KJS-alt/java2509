package com.kim2;

import java.sql.*;

public class DBConnection2 {

    static String URL = "jdbc:mariadb://localhost:3306/exdb";
    static String USER = "root";
    static String PASSWORD = "1234";

    public static Connection getConnection() {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("mariaDB 연결 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static void close(Statement stmt, Connection conn) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(PreparedStatement pstmt, Connection conn){
        try {
            if (pstmt != null) {
                pstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}