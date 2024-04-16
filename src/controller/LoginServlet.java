package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Emp1;
import model.Employee;
import model.EmployeeDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
//    Emp1 emp = EmployeeDao.getuserbyemailandpassword(email, password);
//		if (emp != null) {
//			
//		response.getWriter().print("<table border=' 2px solid black'>"
//				+"<td>"+emp.getId()+"</td>"
//				+"<td>"+emp.getName()+"</td>"
//				+"<td>"+emp.getSalary()+"</td>"
//				+"<td>"+emp.getDepartment()+"</td>"
//				+"</table>");
//		}else{
//			response.getWriter().print("<h1>user not found</h1>");
//		}
		HttpSession session =request.getSession();
		session.setAttribute("email",email );
		if(email.equals("srijithgouri2@gmail.com")&& password.equals("srijith2@")){
			RequestDispatcher req=request.getRequestDispatcher("adminHomeServlet");
			req.forward(request,response);
		}else{
			Employee emp= EmployeeDao.getuserbyemailandpassword(email, password);
			if(emp!=null){
				RequestDispatcher req = request.getRequestDispatcher("empHomeServlet");
				req.forward(request,response);
			}else{
				RequestDispatcher req=request.getRequestDispatcher("Invalid.html");
				req.forward(request,response);
			}
		}
		
	}

}
