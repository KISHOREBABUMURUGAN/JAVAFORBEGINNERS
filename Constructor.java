package javafullcoursepart3;
class Rectangleshape{
	int length,width;
	
	
public	Rectangleshape(){  //default constructor
		System.out.println("Constructor called ");
		length=10;
		width=20;
	}
	int area () {
		int a =length*width;
		return a;
	}
	
	
}





public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangleshape o=new Rectangleshape();
		System.out.println(o.area());

	}

}
