package Day4;

public class Car_annonymousClass {
	interface Tire{
		public void tireRadius();
	}
	private double radius;
	
	public Car_annonymousClass(double circumference){
	Tire tire=new Tire(){
		public void tireRadius(){
			radius=circumference/2*Math.PI;
		}
	};
	tire.tireRadius();
	}
	public static void main(String[] args){
		Car_annonymousClass car=new Car_annonymousClass(10);
		System.out.println(car.radius);
	}
}
