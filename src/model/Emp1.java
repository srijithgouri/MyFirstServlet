package model;

public class Emp1 {
int id;
String name;
int salary;
String department;
String email;
String password;

public Emp1(){
	super();
}
public Emp1(int id,String name,int salary,String department,String email,String password){
	super();
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.department=department;
	this.email=email;
	this.password=password;
	
}
public int getId(){
	return id;
}
public void setId(int id){
	this.id=id;
}
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public int getSalary(){
	return salary;
}
public void setSalary(int salary){
	this.salary=salary;
}
public String getDepartment(){
	return department;
}
public void setDepartment(String department){
	this.department=department;
}
public String getEmail(){
	return email;
}
public void setEmail(String email){
	this.email=email;
}
public String getPassword(){
	return password;
}
public void setPassword(String password){
	this.password=password;
}
public String tostring(){
	return "emp1[id= " + id + ",name= " + name + ",salary= " + salary + ",department= "
                   + department + ",email= " + email + ",password= " + password +"]";
} 
}
