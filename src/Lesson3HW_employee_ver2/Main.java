package Lesson3HW_employee_ver2;

import java.util.Scanner;

public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley","Jim",1000, 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben","Bob",2000, 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph","Susan",3000, 1997, 2, 13, 0);

		
		emps[0].createNameChecking(10500);
		emps[0].createNameSaving(1000);
		emps[0].createNameRetirement(9300);

		emps[1].createNameChecking(34000);
		emps[1].createNameSaving(27000);

		emps[2].createNameChecking(10038);
		emps[2].createNameSaving(12600);
		emps[2].createNameRetirement(9000);

		Scanner sc = new Scanner(System.in);
		System.out.println("See a report of all acount balances? (y/n)");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			String info = getFormattedAccountInfo();

		} else {

		}

	}

	String getFormattedAccountInfo() {

	}
}
