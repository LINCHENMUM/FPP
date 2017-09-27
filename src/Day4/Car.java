package Day4;

public class Car {
	
public class Tire{
	private double radius;
	public Tire(double circumference){
		this.radius=circumference/2*Math.PI;
	}
}
public static void main(String[] args){
	Car.Tire userTire=new Car().new Tire(10);
	System.out.println(userTire.radius);
}
}
