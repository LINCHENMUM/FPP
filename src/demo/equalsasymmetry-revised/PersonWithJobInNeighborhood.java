package lesson7.equalsasymmetry;

 class PersonWithJobInNeighborhood extends PersonWithJob {
	PersonWithJobInNeighborhood(String n, double s, String isIn) {
		super(n, s);
		isInMyNeighborhood = isIn;
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object aPersonNeigh) {
		if(aPersonNeigh == null) return false; 
		//if(!(aPersonNeigh instanceof PersonWithJobInNeighborhood)) return false;
		if(aPersonNeigh.getClass() != this.getClass()) return false;
		PersonWithJobInNeighborhood pn = (PersonWithJobInNeighborhood)aPersonNeigh;
		Boolean isEqual = this.name.equals(pn.name) && this.salary==pn.salary &&
				this.isInMyNeighborhood.equals(pn.isInMyNeighborhood);
		return isEqual;
	}
//	private double salary;
	public String isInMyNeighborhood;

	/*PersonWithJob(String n, double s, boolean isIn) {
		super(n, s);
		
	}*/
}
