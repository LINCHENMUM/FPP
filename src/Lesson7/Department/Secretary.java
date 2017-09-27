package Lesson7.Department;

import java.util.Date;

public class Secretary extends DeptEmployee {
private double overtimeHours;
	public Secretary(String name, double salary, Date hiredate,double overtimeHours) {
		super(name, salary, hiredate);
		// TODO Auto-generated constructor stub
		this.overtimeHours=overtimeHours;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	public double computeSalary() {
		double initialsalary=super.computeSalary();
		this.salary=initialsalary+12*this.overtimeHours;
		return this.salary;
	}
	
	public String toString(){
		return "Name is " + this.name + " " + "Hire Date is " + this.hireDate + " " + "Salary is " + this.computeSalary()+" "+"OvertimeHours is "+this.overtimeHours;
	}
}
