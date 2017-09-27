package Lesson3HW;

public class Main {
public static void main(String[] args){
	Employee employee=new Employee("Lin Chen","LC",8000,2016,10,25);
	Account checking= new Account(employee,AccountType.CHECKING.toString(),300);
	Account retirement= new Account(employee,AccountType.RETIREMENT.toString(),300);
	Account saving= new Account(employee,AccountType.SAVINGS.toString(),300);
	
	System.out.println(checking);
	System.out.println(retirement);
	System.out.println(saving);
	
}
}
