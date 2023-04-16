package javafullcoursepart3;
 interface animal{
	void sound();
	void sleep();
	
}
 class dog implements animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("BOW_BOW");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("It sleep @9.00pm");
	}
	 
 }
public class Multipleinheritance {        //multiple interface
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog d=new dog();
d.sound();
d.sleep();
	}

}
