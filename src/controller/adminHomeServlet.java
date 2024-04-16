package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adminHomeServlet")
public class adminHomeServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter pw=response.getWriter();
	String email=request.getParameter("email");
	pw.print("<strong>"+email+"</strong>");
	pw.print("<center><h1>Welcome to Admin page</h1>"+
	"<a href='GetAlluser'>GetAlluser</a> <br>"+
	"<a href='findEmp.html'>getuserbyid</a>");
	}

	

}
