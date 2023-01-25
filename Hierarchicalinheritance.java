package javafullcoursepart3;
class shape{
	float length ,breadth, radius;
}
class rectangle extends shape{
	public rectangle(float l ,float b) {
		length =l;
		breadth=b;
	}
	
	float rectangle_area(){
		return (length * breadth);
	}
}

class circle extends shape{
	public circle(float r) {
		radius =r;
	}
	float circle_area() {
		return 3.14f*(radius * radius);
	}
}

class square extends shape{
	public square(float l) {
		length =l;		
	}
	float square_area() {
		return (length*length);
	}
}

public class Hierarchicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle r=new rectangle(10,20);
System.out.println(r.rectangle_area());  

circle c=new circle(10);
System.out.println(c.circle_area());

square s=new square(10);
System.out.println(s.square_area());

	}

}
