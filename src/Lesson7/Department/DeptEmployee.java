package Lesson7.Department;

import java.util.*;

public class DeptEmployee {
	protected String name;
	protected double salary;
	protected Date hireDate = new Date();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public double computeSalary() {
		return this.salary;
	}

	public DeptEmployee(String name, double salary, Date hiredate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hiredate;
	}

	public String toString() {
		return "Name is " + this.name + " " + "Hire Date is " + this.hireDate + " " + "Salary is " + this.salary;
	}
}
