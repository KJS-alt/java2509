package com.kim;

import java.sql.*;

public class CRUDClass {

    public CRUDClass() {

//        createTable();
//        selectUsers();
        insertUsers("1", "홍길동");
        insertUsers("2", "일지매");
        insertUsers("3", "세종대왕");
        insertUsers("4", "장영실");
        selectUsers();

    }

    private void insertUsers(String id, String name) {
        String sql = "insert into users(id, name) values (?, ?)";
        Connection conn = null;
        PreparedStatement pstmt = null;


        try {
            conn = DBConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            int rows = pstmt.executeUpdate();
            System.out.println("----------" + rows + "행이 추가되었음.");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.close(pstmt, conn);
        }
    }

    private void selectUsers() {
        String sql = "SELECT  * FROM users;";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if(!rs.next()) {
                System.out.println("users 테이블에 조회된 결과 없음");
            } else {
                int rowCount = 0;
                do {
                    rowCount++;
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    System.out.println("id: " + id + "  NAME: " + name);
                } while (rs.next());
                System.out.println("-----" + rowCount + "----");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(pstmt, conn);
        }

    }

    private void createTable() {
        System.out.println("---------- 새로운 테이블 생성 START -----------");
//        DB연결
        String sql = "CREATE TABLE IF NOT EXISTS users(\n" +
                "    id varchar(50),\n" +
                "    name varchar(100)\n" +
                ")";
        Connection conn = null;
        Statement stmt = null;


        try {
            conn = DBConnection.getConnection();
            stmt = conn.createStatement();

            stmt.execute(sql);
            System.out.println("users 테이블이 존재합니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(stmt, conn);
        }

        System.out.println("---------- 새로운 테이블 생성 END -------------");
    }
}
