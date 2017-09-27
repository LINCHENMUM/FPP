package Day4;

public class Annonymous_Car {
	interface Tire{
		public void getRadius();
	}
	private double radius;
	public Annonymous_Car(double circulumn){
		Tire tire=new Tire() {
			public void getRadius(){
				radius=circulumn/2*Math.PI;
			}	
	};
				tire.getRadius();
	}
	public static void main(String[] args){
		Annonymous_Car car=new Annonymous_Car(10);
		System.out.println(car.radius);
	}
}
