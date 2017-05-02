package prob6;

public class RectTriangle extends Shape {
	private double width = 0;
	private double height = 0;
	
	public RectTriangle(double w, double h) {
		width = w;
		height = h;
	}

	@Override
	double getArea() {
		return width*height*0.5;
	}

	@Override
	double getPerimeter() {
		return width+height+Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
	}

}
