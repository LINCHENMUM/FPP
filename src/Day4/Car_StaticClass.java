package Day4;

public class Car_StaticClass {

static class Tire{
	private static double radius;
	public Tire(double circumference){
		this.radius=circumference/2*Math.PI;
	}
}
public static void main(String[] args){
	Car_StaticClass.Tire tire=new Car_StaticClass.Tire(10);
	System.out.println(tire.radius);
}
}
