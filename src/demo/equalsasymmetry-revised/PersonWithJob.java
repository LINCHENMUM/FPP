package lesson7.equalsasymmetry;

public class PersonWithJob extends Person {
	public double salary;
	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPersonWithJob) {
		if(aPersonWithJob == null) return false; 
		//if(!(aPersonWithJob instanceof PersonWithJob)) return false;
		if(aPersonWithJob.getClass() != this.getClass()) return false;
		PersonWithJob p = (PersonWithJob)aPersonWithJob;
		boolean isEqual = this.name.equals(p.name) && this.salary==p.salary;
		return isEqual;
	}
	
	

}
