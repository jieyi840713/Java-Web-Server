package myCode;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetFromServlet", value = "/GetFromServlet")
public class GetFromServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // GET parameters from get request
        String bookName = request.getParameter("name");
        String bookPrice = request.getParameter("price");
        String bookAuthor = request.getParameter("author");
        PrintWriter out = response.getWriter();
        out.println("<h1> Name: " + bookName + "</h1>");
        out.println("<h1> Price: " + bookPrice + "</h1>");
        out.println("<h1> Author: " + bookAuthor + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
