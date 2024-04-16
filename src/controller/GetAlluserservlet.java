package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Employee;
import model.EmployeeDao;

/**
 * Servlet implementation class GetAlluser
 */
@WebServlet("/GetAlluser")
public class GetAlluserservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> empList = EmployeeDao.printAll();
		HttpSession session=request.getSession();
		String mail=(String)session.getAttribute("email");
	
		PrintWriter pw = response.getWriter();
		pw.print("<strong>"+mail+"</strong>");
		pw.print("<table border=' 2px solid black'>");
		for (Employee emp:empList)
		if (emp != null) {
		pw.print("<tr><td>"+emp.getId()+"</td>"
				+"<td>"+emp.getName()+"</td>"
				+"<td>"+emp.getOccupation()+"</td>"
				+"<td>"+emp.getWorking_date()+"</td>"
			    +"<td>"+emp.getWorking_hours()+"</td>"
			    +"<td>"+emp.getemail()+"</td>"
			    +"<td>"+emp.getpassword()+"</td>"
				+ "</tr>");
		}
		pw.print("<center></table></center>");
	}
		
	}

