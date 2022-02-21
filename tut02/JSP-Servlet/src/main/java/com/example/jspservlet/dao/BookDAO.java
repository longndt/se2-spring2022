package com.example.jspservlet.dao;

import com.example.jspservlet.dbconnect.DBConnect;
import com.example.jspservlet.entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private Connection connection;

    public BookDAO() {
        connection = DBConnect.getConnection();
    }

    public List<Book> selectAllBooks() {
        List<Book> books = new ArrayList<>();

        try {
            String sql = "SELECT * FROM book";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String author = rs.getString("author");
                float price = rs.getFloat("price");
                books.add(new Book(id, title, author, price));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}

