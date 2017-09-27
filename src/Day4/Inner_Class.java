package Day4;

public class Inner_Class {
	public double getRadius(double circulumn) {

		class Tire {
			double radius;

			public Tire() {
				radius = circulumn / 2 * Math.PI;
			}
		}
		Tire tire = new Tire();
		return tire.radius;
	}

	public static void main(String[] agrs) {
		Inner_Class car = new Inner_Class();
		System.out.println(car.getRadius(10));
	}
}
