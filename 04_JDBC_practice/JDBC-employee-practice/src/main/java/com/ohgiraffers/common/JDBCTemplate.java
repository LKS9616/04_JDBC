package com.ohgiraffers.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCTemplate {
    public static Connection getConnection() {

        Connection con = null;

        Properties prop = new Properties();


        try {
            prop.load(new FileReader("src/main/java/com/ohgiraffers/config/jdbc-config.properties"));

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");

            Class.forName(driver);

            con = DriverManager.getConnection(url, prop);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return con;
    }

    public static void close(Connection con) {
        try {
            if (con != null && !con.isClosed()) {

                con.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Statement stmt) {
        try {
            if (stmt != null && !stmt.isClosed()) {

                stmt.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(ResultSet rset) {
        try {
            if (rset != null && !rset.isClosed()) {

                rset.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
* Employee
* 1. 목록 전체 조회
* 2. 추가
* 3. 수정
* 4. 삭제
* 5. 단일 조회*/
