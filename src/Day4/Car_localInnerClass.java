package Day4;

public class Car_localInnerClass {

	public double Tire(double circumference) {
		class Tire {
			private double radius;

			public Tire() {
				this.radius = circumference / 2 * Math.PI;
			}
		}
		return new Tire().radius;
	}

	public static void main(String[] args) {
		double circumference = 10;
		Car_localInnerClass carInnerclass = new Car_localInnerClass();
		System.out.println(carInnerclass.Tire(circumference));
	}
}
