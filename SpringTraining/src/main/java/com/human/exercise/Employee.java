package com.human.exercise;

public class Employee {
	private String employee_id;   
	private String emp_name;	
	private String email; 
	private String phone_number; 
	private String hire_Date;        
	private int salary;
	private String department_id;
	private String department_name;
	private String dname;
	private String manager_name;
	private int roomcode;
	private String name;
	private String typename;
	private int type;
	private int howmany;
	private int howmuch;
	public Employee() {
	}
	public Employee(String employee_id, String emp_name, String email, String phone_number, String hire_Date,
			int salary, String department_id, String department_name, String dname, String manager_name, int roomcode,
			String name, String typename, int type, int howmany, int howmuch) {
		this.employee_id = employee_id;
		this.emp_name = emp_name;
		this.email = email;
		this.phone_number = phone_number;
		this.hire_Date = hire_Date;
		this.salary = salary;
		this.department_id = department_id;
		this.department_name = department_name;
		this.dname = dname;
		this.manager_name = manager_name;
		this.roomcode = roomcode;
		this.name = name;
		this.typename = typename;
		this.type = type;
		this.howmany = howmany;
		this.howmuch = howmuch;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getHire_Date() {
		return hire_Date;
	}
	public void setHire_Date(String hire_Date) {
		this.hire_Date = hire_Date;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public int getRoomcode() {
		return roomcode;
	}
	public void setRoomcode(int roomcode) {
		this.roomcode = roomcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getHowmany() {
		return howmany;
	}
	public void setHowmany(int howmany) {
		this.howmany = howmany;
	}
	public int getHowmuch() {
		return howmuch;
	}
	public void setHowmuch(int howmuch) {
		this.howmuch = howmuch;
	}
	
	
}
