package Lesson7Closedcurve;

public final class Rectangle extends ClosedCurve{
	private final double width;
	private final double length;
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	double computeArea(){
		return (this.width*this.length);
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
}
