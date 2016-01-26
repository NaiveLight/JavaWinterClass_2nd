package company.inheritance;

class Shape{
	
	public void draw(){
		System.out.println("draw shape");
	}
	
	
}

class Circle extends Shape{
	public void draw(){
		System.out.println("draw circle");
	}
}

class Rectangle extends Shape{
	public void draw(){
		System.out.println("draw rectangle");
	}
}

class Triangle extends Shape{
	public void draw(){
		System.out.println("draw Triangle");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeTest test = new ShapeTest();
		test.drawShape(new Circle());
		test.drawShape(new Rectangle());
		test.drawShape(new Triangle());
	}
	
	public void drawShape(Shape s){
		s.draw();
	}

}
