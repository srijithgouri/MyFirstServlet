package model;

public class Employee {
	int id;
	String name;
	String occupation;
	String working_date;
	int working_hours;
	String email;
	String password;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String occupation, String working_date, int working_hours,String email,String password) {
		super();
		this.id = id;
		this.name = name;
		this.occupation = occupation;
		this.working_date = working_date;
		this.working_hours = working_hours;
		this.email=email;
		this.password=password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getWorking_date() {
		return working_date;
	}
	public void setWorking_date(String working_date) {
		this.working_date = working_date;
	}
	public int getWorking_hours() {
		return working_hours;
	}
	public void setWorking_hours(int working_hours) {
		this.working_hours = working_hours;
	}
	public String getemail(){
		return email;
	}
	public void setemail(String email){
		this.email=email;
	}
	public String getpassword(){
		return password;
	}
	public void setpassword(String password){
		this.password=password;
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", occupation=" + occupation + ", working_date=" + working_date
//				+ ", working_hours=" + working_hours + "]";
//	}
	
	
}
