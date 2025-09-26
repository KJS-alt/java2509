package com.kim2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDClass2 {
    public CRUDClass2() {

//        createTable();
//        dropTable();
//        insertUsers("1", "홍길동");
//		insertUsers("2", "일지매");
//		insertUsers("3", "세종대왕");
//		insertUsers("4", "장영실");

//        deleteUsers("4");

        updateUsers("2", "일지매_수정후");
    }

    private void updateUsers(String id, String name) {
        System.out.println("------ 레코드 내용 수정 -------");
        String sql = "";
        Connection conn = null;
        PreparedStatement pstmt =null;

        try {
            conn = DBConnection2.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, id);
            int rows = pstmt.executeUpdate();
            System.out.println("----" + rows + "행이 수정됨 ----");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection2.close(pstmt, conn);
        }
        System.out.println("----- 레코드 내용 수정 -----");

    }

    private void deleteUsers(String id) {
        System.out.println("---- 레코드 삭제 ----");
        String sql = "delete from users where id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DBConnection2.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            int rows = pstmt.executeUpdate();
            System.out.println("----" + rows + "행이 삭제됨");
        }catch(SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection2.close(pstmt, conn);
        }
        System.out.println("---- 레코드 삭제 ----");

    }

    private void insertUsers(String id, String name) {
        System.out.println("----- 레코스 추가 ----");
        String sql = "insert into users(id, name) values (?,?)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            conn = DBConnection2.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            int rows = pstmt.executeUpdate();
            System.out.println("----" + rows + "행이 추가됨");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBConnection2.close(pstmt, conn);
        }

    }

    private void dropTable() {
        System.out.println("---- 테이블 삭제 ----");
        String sql = "drop table users;";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DBConnection2.getConnection();
            stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("users 테이블이 삭제됨");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection2.close(stmt, conn);
        }
        System.out.println("---- 테이블 삭제 ----");
    }

    private void createTable() {
        System.out.println("새로운 테이블 생성");
        String sql = "create table if not exists users\n" +
                "(\n" +
                "    id   varchar(50),\n" +
                "    name varchar(100)\n" +
                ")";
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DBConnection2.getConnection();
            stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("users 테이블 존재");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection2.close(stmt, conn);
        }
        System.out.println("----새로운 테이블 생성 END");
    }
}
