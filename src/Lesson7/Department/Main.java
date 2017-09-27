package Lesson7.Department;

import java.text.DateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Date date1 = new Date();
		Professor professor1 = new Professor("Prof. 1", 1000.0, date1, 10);
		Date date2 = new Date();
		Professor professor2 = new Professor("Prof. 2", 1000.0, date2, 10);
		Date date3 = new Date();
		Professor professor3 = new Professor("Prof. 3", 1000.0, date3, 10);

		Date date4 = new Date();
		Secretary Secretary1 = new Secretary("Secretary 1", 1000.0, date4, 200);
		Date date5 = new Date();
		Secretary Secretary2 = new Secretary("Secretary 2", 1000.0, date5, 200);

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = professor1;
		department[1] = professor2;
		department[2] = professor3;
		department[3] = Secretary1;
		department[4] = Secretary2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to see the sum of all salaries?");
		while (true) {
			String answer = scanner.nextLine().toUpperCase();
			if (answer.equals("EXIT")) 
				break;
			else if (answer.equals("YES")) {
				double sumOfProfessor = department[0].salary + department[1].salary + department[2].salary;
				double sumOfSecretary = department[3].computeSalary() + department[4].computeSalary();
				System.out.println("Sum of Professor department salary is " + sumOfProfessor);
				System.out.println(department[0]);
				System.out.println(department[1]);
				System.out.println(department[2]);
				System.out.println(" ");
				System.out.println("Sum of Secretary department salary is " + sumOfSecretary);
				System.out.println(department[3]);
				System.out.println(department[4]);
			}
		}
	}
}
