package DAY06.Ex01_Shape;

public class Circle extends Shape{

	double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	@Override
	double area() {
		// (원주율)X(반지름)X(반지름)
		return Math.PI * radius * radius;
	}

	@Override
	double round() {
		// 2 X (원주율) X (반지름)
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
