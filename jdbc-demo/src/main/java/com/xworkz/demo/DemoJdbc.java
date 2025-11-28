package com.xworkz.demo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {
    public static void main(String[] args) {
        System.out.println("Main started");

        String url="jdbc:mysql://localhost:3306/matrimony";
        String username="root";
        String password="Vina@2002";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection);
            System.out.println("Connected");
            String sql="insert into matrimony_form values('sruju@gmail.com','myself','male','2012-11-11','kannada','hindu','single',6)";
            Statement statement=connection.createStatement();
            int rowsAffected=statement.executeUpdate(sql);
            System.out.println(rowsAffected+"rows Affected");
        } catch (SQLException e) {
            System.out.println("error msg:"+e.getMessage());
            throw new RuntimeException(e);
        }


        System.out.println("Catch Afer Block Execution....");
    }
}
