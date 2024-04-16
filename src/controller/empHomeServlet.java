package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/empHomeServlet")
public class empHomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String mail=(String)session.getAttribute("email");
		
		PrintWriter pw=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		pw.print("<strong>"+email+"</strong>");
		pw.print("<center><h1>welcome to Employee page</h1><br>");
		pw.print("<center><h1>Employee profile</h1><br>");
		pw.print("<h3>emailid"+email+"</h3><br>");
		pw.print("<h3>password"+password+"</h3><br>");
		pw.print("<input type='submit' value='change password'>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
