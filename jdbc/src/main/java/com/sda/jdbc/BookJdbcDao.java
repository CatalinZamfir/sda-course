package com.sda.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//dao - data acces object
public class BookJdbcDao {
    public static final String URL = "jdbc:mysql:localhost/3306/jdbc_tutorial?serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "1234";

    public void create(Book book){

       try {

           //get connection
           Connection connection = DriverManager.getConnection(URL,USER, PASSWORD);

           //create statement
           String sql = "INSERT INTO book(title,author) VALUES " + book.getTitle() + ", " + book.getAuthor();
           Statement statement = connection.createStatement();
           //execute statement
           int rowsAffected = statement.executeUpdate(sql);
           if (rowsAffected == 1){
               System.out.println("book saved");
           }
       //close connection
           connection.close();

       }catch (SQLException e){
           System.out.println("book not saved");
       }
    }
}
