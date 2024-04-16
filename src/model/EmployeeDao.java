package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDao {
	static String dbUrl = "jdbc:mysql://localhost:3306/fsd50";
	   static String dbUsername = "root";
	   static String dbPassword = "root";
	public static Employee getempbyId(int id) {
		  Employee emp=null;
		   // Example query: SELECT * FROM user WHERE empid = '103'
		   String query = "SELECT * FROM employee WHERE id = " + id + "";
		   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int empId = rs.getInt("id");
				String empName = rs.getString("name");
				String empOccupation = rs.getString("occupation");
				String working_date = rs.getString("working_date");
				int working_hours = rs.getInt("working_hours");
				String email=rs.getString("email");
				String password=rs.getString("password");
				emp = new Employee(empId, empName, empOccupation, working_date, working_hours,email,password);
			}
			rs.close();
		   	stmt.close();
		   	con.close();
		   } catch(ClassNotFoundException ex) {
			System.out.println("Driver class not found.");
		   } catch(SQLException ex) {
			System.out.println("Exception: Check spelling mistake in values of dbUrl or dbUsername or dbPassword or query");
		   }
		   return emp;
		}
	public static List<Employee> printAll() {
		Employee emp=null;
		  List<Employee> list=new ArrayList<Employee>();
		   // Example query: SELECT * FROM user WHERE empid = '103'
		   String query = "SELECT * FROM employee";
		   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int empId = rs.getInt("id");
				String empName = rs.getString("name");
				String empOccupation = rs.getString("occupation");
				String working_date = rs.getString("working_date");
				int working_hours = rs.getInt("working_hours");
				String email=rs.getString("email");
				String password=rs.getString("password");
				 emp = new Employee(empId, empName, empOccupation, working_date, working_hours,email,password);
				 list.add(emp);
			}
			rs.close();
		   	stmt.close();
		   	con.close();
		   } catch(ClassNotFoundException ex) {
			System.out.println("Driver class not found.");
		   } catch(SQLException ex) {
			System.out.println("Exception: Check spelling mistake in values of dbUrl or dbUsername or dbPassword or query");
		   }
		   return list;
		}
 public static Employee getEmployeeByName(String name) {
		Employee emp=null;
		String dbUrl = "jdbc:mysql://localhost:3306/fsd50";
		   String dbUsername = "root";
		   String dbPassword = "root";
		   String query = "SELECT * FROM employee where name='"+name+"'";
		   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			// using different get methods based on the columns that are being printed: userName, gender, dob, country
			while (rs.next()) {
				int empId = rs.getInt("id");
				String empName = rs.getString("name");
				String empOccupation = rs.getString("occupation");
				String working_date = rs.getString("working_date");
				int working_hours = rs.getInt("working_hours");
				String email=rs.getString("email");
				String password=rs.getString("password");
				 emp = new Employee(empId, empName, empOccupation, working_date, working_hours,email,password);
			}
			rs.close();
		   	stmt.close();
		   	con.close();
		   } catch(ClassNotFoundException ex) {
			System.out.println("Driver class not found.");
		   } catch(SQLException ex) {
			System.out.println("Exception: Check spelling mistake in values of dbUrl or dbUsername or dbPassword or query");
		   }
		   return emp;
	}
 public static void printUserByName(String name) {
		  
		 
		   String query = "SELECT * FROM employee WHERE ename = '" + name + "'";
		   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getString("empid") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("salary") + "\t");
				System.out.println(rs.getString("deptid"));
			}
			rs.close();
		   	stmt.close();
		   	con.close();
		   } catch(ClassNotFoundException ex) {
			System.out.println("Driver class not found.");
		   } catch(SQLException ex) {
			System.out.println("Exception: Check spelling mistake in values of dbUrl or dbUsername or dbPassword or query");
		   }
		}
	public static Employee getuserbyemailandpassword(String email,String password){
	 Employee emp=null;
		String query="select * from employee where email='"+email+ "'and password='"+password+"'";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next()){
				int empId=rs.getInt("id");
				String empName=rs.getString("name");
				String empOccupation=rs.getString("occupation");
				String empWorking_date=rs.getString("working_date");
				int empWorking_hours=rs.getInt("working_hours");
				String empEmail=rs.getString("email");
				String empPassword=rs.getString("password");
							
				emp=new Employee(empId, empName,empOccupation,empWorking_date,empWorking_hours,empEmail,empPassword);
				System.out.println();
			}
			rs.close();
			stmt.close();
			con.close();
		} catch(ClassNotFoundException ex){
			System.out.println("Driver class not found");
		}catch(SQLException ex){
			System.out.println("Exception: Check spelling mistake in values of dbUrl or dbUsername or dbPassword or query");
		}
		return emp;
	}
//		insert new employee details in employee table
		public static void insertEmpolyee(int id, String name, String occupation, String working_date, int working_hours){
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
				String query1="INSERT INTO employee VALUES(?,?,?,?,?)";
				PreparedStatement pstmt=prepareStatement(query1);
				System.out.println(pstmt);
				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				pstmt.setString(3,occupation);
				pstmt.setString(4,working_date);
				pstmt.setInt(5,working_hours);
				pstmt.executeUpdate();
				System.out.println(pstmt);
				pstmt.close();
				con.close();
			}catch(ClassNotFoundException ex){
				System.out.println("Driver class not found");
			}catch(SQLException ex){
				System.out.println("Exception: Check spelling mistake in values of dbUrl or dbUsername or dbPassword or query");
			}
		}
	
	private static PreparedStatement prepareStatement(String query) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		 //printUserBy(101);
		//printUserByName("srijith");
       //printAll();
	}

}
