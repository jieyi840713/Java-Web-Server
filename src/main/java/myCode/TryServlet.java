package myCode;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TryServlet", value = "/TryServlet")
public class TryServlet extends HttpServlet {

    @Override
    public void init() throws ServletException{
        super.init();
        System.out.println("We are now calling the init method...");
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request,response);
        System.out.println("We are now calling the service method...");
    }

    @Override
    public void destroy(){
        super.destroy();
        System.out.println("We are now destroy the service method...");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>This is tryServlet...</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
