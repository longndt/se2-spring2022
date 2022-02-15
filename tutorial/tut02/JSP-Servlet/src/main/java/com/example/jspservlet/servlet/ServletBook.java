package com.example.jspservlet.servlet;

import com.example.jspservlet.dao.BookDAO;
import com.example.jspservlet.entity.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(value = "/")
public class ServletBook extends HttpServlet {
    private BookDAO bookDAO;

    @Override
    public void init() {
        bookDAO = new BookDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listUser(request, response);
    }

    private void gettBookList (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> listBook = bookDAO.selectAllBooks();
        request.setAttribute("bookList", listBook);
        RequestDispatcher dispatcher = request.getRequestDispatcher("booklist.jsp");
        dispatcher.forward(request, response);
    }
}

