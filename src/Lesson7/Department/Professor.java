package Lesson7.Department;

import java.util.Date;

public class Professor extends DeptEmployee {
	private int numberOfPublications;

	public Professor(String name, double salary, Date hiredate, int numberOfPublications) {
		super(name, salary, hiredate);
		// TODO Auto-generated constructor stub
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	public String toString() {
		return "Name is " + this.name + " " + "Hire Date is " + this.hireDate + " " + "Salary is " + this.salary + " "
				+ "Number of Publications is " + this.numberOfPublications;
	}

}
