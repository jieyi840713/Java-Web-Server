package book;

import Ojb.Book;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.*;

@WebServlet(name = "BookServlet", value = "/BookServlet")
public class BookServlet extends HttpServlet {
    private PreparedStatement preparedStatement;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        initializeJDBC();
        try {
            preparedStatement.setString(1, request.getParameter("bookId"));
            ResultSet rs = preparedStatement.executeQuery();
            Book book = null;
            if(rs.next()){
                book = new Book();
                book.setBookId(rs.getInt("bookId"));
                book.setName(rs.getString("name"));
                book.setPrice(rs.getInt("price"));
                book.setAuthor(rs.getString("author"));
            }

            request.setAttribute("book", book);
            request.getRequestDispatcher("/book.jsp").forward(request,response );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void initializeJDBC(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading... ");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaPracticeDB", "jay", "password");
            System.out.println("Database connected...");

            preparedStatement = conn.prepareStatement("Select * from book where bookId = ?");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
