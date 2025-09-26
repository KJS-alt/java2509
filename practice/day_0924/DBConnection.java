package com.kim;

import java.sql.*;

public class DBConnection {
//    DB접속정보_기본
    static String URL = "jdbc:mariadb://localhost:3306/employees";
    static String USER = "root";
    static String PASSWORD = "1234";

    public static Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("========== DB 연결 성공 ==========");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("========== DB 연결 실패 ==========");
        }
        return conn;
    }


    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
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
    }


    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (pstmt != null)
                pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
