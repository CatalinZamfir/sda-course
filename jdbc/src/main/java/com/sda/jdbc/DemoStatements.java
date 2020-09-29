package com.sda.jdbc;



public class DemoStatements {

    public static void main(String[] args) {
        Book book = new Book("game", "george");

      BookJdbcDao dao = new BookJdbcDao();
      dao.create(book);

    }

}
