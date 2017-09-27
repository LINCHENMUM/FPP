package Day4;

public class Member_Car {
	
public class Tire{
	private double radius;
	public Tire(double circulumn){
		this.radius=circulumn/2*Math.PI;
	}
}
public static void main(String[] args){
	Member_Car.Tire tire=new Member_Car().new Tire(10);
	System.out.println(tire.radius);
	
}
}
