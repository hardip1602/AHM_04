package single_inheritance;

public class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		//return super.getPerimeter();
		return 2*3.14*radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		//return super.getArea();
		return 3.14*radius*radius;
	}
}