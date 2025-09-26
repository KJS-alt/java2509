package com.kim;

import java.sql.*;

public class CRUDClass {
    public CRUDClass() {

//        Create 테이블 - create trable
//        createTable();


//        Read 테이블 - select
        selectTable();

//        Update 테이블 - update table
//        updateTable();

//        Drop테이블삭게
        droptable();

//        Delete 테이블안의 row삭제 - delete
//        deleteUser();

//        insert
//        insertUser();

    }

    private void droptable() {

    }

    private void insertUser() {
    }

    private void deleteUser() {
    }


    private void updateTable() {
    }

    private void selectTable() {
        String sql = "show tables";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            System.out.println("----- employees 데이터베이스내의 내용 확인");

            while (rs.next()) {
//                 String talName = rs.getString("tables_in_employees");
                String talName2 = rs.getString(1);
//                 System.out.println("[" + talName + "--" + talName2 + "]");
                System.out.println("[" + talName2 + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(rs, pstmt, conn);
        }

    }

    private void createTable() {
        String sql = "create table if not exists users\n" +
                "(\n" +
                "    id varchar(50),\n" +
                "    name varchar(100)\n" +
                ");";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("users 테이블 생성 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.close(stmt, conn);
        }

    }
}
