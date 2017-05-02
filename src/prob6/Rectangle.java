package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width = 0;
	private double height = 0;
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	@Override
	public void resize(double s) {
		width = width*s;
		height = height*s;
	}

	@Override
	double getArea() {
		return width*height;
	}

	@Override
	double getPerimeter() {
		return (width+height)*2;
	}

}
