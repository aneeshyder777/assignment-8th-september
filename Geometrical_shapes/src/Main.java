//program to caluclate area of different geometrical shapes.

//parent class
class Shape{
	final double PI=3.14;//final unmutable variable
	float radius;
	float side;
	
	void display() {
		System.out.println("The Area of various shapes are:");
	}
	
}
//child class
class Circle extends Shape{
	
	
	void getArea(float radius) {
		super.display();
		
		this.radius=radius;
		
	}
	void display() {
		System.out.println("Area of the Circle is"+" "+PI*Math.pow(radius,2));
	}
	
}
//second child class
class Square extends Shape{
	void getArea(int side) {
		this.side=side;
		
	}
	void display() {
		System.out.println("Area of the square is"+" "+side*side);
	}
	
}

public class Main {

	public static void main(String[] args) {    //main method
		
		Circle c=new Circle();
		c.getArea(3);
		c.display();
		Square s=new Square();
		s.getArea(2);
		s.display();
}
	
}