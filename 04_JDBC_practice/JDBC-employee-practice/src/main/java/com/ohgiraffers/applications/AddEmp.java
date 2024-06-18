package com.ohgiraffers.applications;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class AddEmp {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        int result = 0;

        Properties prop = new Properties();


        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/employee-query.xml"));

            String query = prop.getProperty("addEmployee");

            pstmt = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);

            System.out.print("직원의 코드를 입력하세요 : ");
            String empId = sc.nextLine();

            System.out.print("직원의 이름을 입력하세요 : ");
            String empName = sc.nextLine();

            System.out.print("직원의 번호를 입력하세요 : ");
            String empNo = sc.nextLine();

            System.out.println("직원의 이메일을 입력하세요");
            String email = sc.nextLine();
            System.out.println("직원의 전화번호를 입력하세요");
            String phone = sc.nextLine();
            System.out.println("직원의 부서코드를 입력하세요");
            String deptCode = sc.nextLine();
            System.out.println("직원의 업무코드를 입력하세요");
            String jobCode = sc.nextLine();
            System.out.println("직원의 월급레벨을 입력하세요");
            String salLevel = sc.nextLine();
            System.out.println("직원의 월급을 입력하세요");
            double salary = sc.nextInt();
            System.out.println("직원의 보너스를 입력하세요");
            double bonus = sc.nextInt();
            System.out.println("직원의 매니저 ID를 입력하세요");
            String managerId = sc.nextLine();
            System.out.println(" (yyyy-mm-dd):");
            String dateString = scanner.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            MenuDTO newMenu = new MenuDTO();
            newMenu.setMenuName(menuName);
            newMenu.setMenuPrice(menuPrice);
            newMenu.setCategoryCode(categoryCode);
            newMenu.setOrderableStatus(orderableStatus);

            private String empId;
            private String empName;
            private String empNo;
            private String email;
            private String phone;
            private String deptCode;
            private String jobCode;
            private String salLevel;
            private double salary;
            private double bonus;
            private String managerId;
            private java.sql.Date hireDate;
            private java.sql.Date entDate;
            private String entYn;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
