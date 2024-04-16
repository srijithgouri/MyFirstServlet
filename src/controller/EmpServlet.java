package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import model.EmployeeDao;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	
    public EmpServlet() {
        super();
        
    }

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name=request.getParameter("name");
//		Employee emp=EmployeeDao.getEmployeeByName(name);
//		if(emp!=null){
//			response.getWriter().print("<h1>Employee details</h1>");
//			response.getWriter().print("<table border='2px solid black'>"
//					+"<td>"+emp.getId()+"<td>"
//					+"<td>"+emp.getName()+"<td>"
//					+"<td>"+emp.getOccupation()+"<td>"
//					+"<td>"+emp.getWorking_date()+"<td>"
//					+"<td>"+emp.getWorking_hours()+"<td>"
//					+"</table>");
//		}else{
//			response.getWriter().print("<h1>User not found</h1>");
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int Id=Integer.parseInt(request.getParameter("name"));
			Employee emp=EmployeeDao.getempbyId(Id);
			if(emp!=null){
				response.getWriter().print("<h1>Employee details</h1>");
				response.getWriter().print("<table border='2px solid black'>"
						+"<td>"+emp.getId()+"<td>"
						+"<td>"+emp.getName()+"<td>"
						+"<td>"+emp.getOccupation()+"<td>"
						+"<td>"+emp.getWorking_date()+"<td>"
						+"<td>"+emp.getWorking_hours()+"<td>"
						+"<td>"+emp.getemail()+"<td>"
						+"<td>"+emp.getpassword()+"<td>"
						+"</table>");
//			}else{
//				response.getWriter().print("<h1>User not found</h1>");
		
	}
		}
		}
