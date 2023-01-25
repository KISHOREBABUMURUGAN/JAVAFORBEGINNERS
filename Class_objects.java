package javafullcoursepart3;
class Rectangle{
	int length,width;

	void getDetails(int x,int y) {
	length=x;
	width=y;
}

	
	int area() {
		int a=length*width;
		return a;
		
	}
	
}
public class Class_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle o1=new Rectangle();

o1.length=10;
o1.width=10;

System.out.println("Area of Rectangle"+o1.area());


Rectangle o2=new Rectangle();

o2.getDetails(20, 20);
System.out.println("Area of Rectangle"+o2.area());
	}

}
