package javafullcoursepart3;
abstract class shape{
	abstract void draw() ;
	void message() {
		System.out.println("My name is kishorebabu");
	}
	
	
}
class rectangleshape extends shape{
	
	void draw() {
		System.out.println("Happy birthday sri vishnu ram ");
	}
}

public class Dataabstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangleshape o =new rectangleshape();
o.draw();
o.message();
	}

}
