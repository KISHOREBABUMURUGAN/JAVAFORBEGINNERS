package javafullcoursepart3;


class box {

	float length,width;
	
	public box() {
		length=20;
		width=10;
	}
	
	public box(float x,float y) {   //parameter constructor
		length=x;
		width=y;
	}
	
	public box(float x) { //single synthesis
		length=width=x;
	}
	
	
	
	
	float area() {
		float a =length*width;
		return a;
	}
}
public class Parameterconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
box o=new box();
System.out.println("Area : "+o.area()); 

box o1=new box(2,3);
System.out.println("Area : "+o1.area()); 


box o2=new box(12);

System.out.println("Area : "+o2.area()); 




	}

}
