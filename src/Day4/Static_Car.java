package Day4;

public class Static_Car {
	static class Tire {
		double radius;

		private double tire(double circulume) {
			this.radius = circulume / 2 * Math.PI;
			return radius;
		}
	}

	public static void main(String[] args) {
		Static_Car.Tire tire = new Static_Car.Tire();
		double radius = tire.tire(10);
		System.out.println(radius);
	}
}
