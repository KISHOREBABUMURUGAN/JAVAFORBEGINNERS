package javafullcoursepart3;
abstract class mobile{
	public void call() {
		System.out.println("You can make  a call ");
	}
	 abstract void camera();
	 abstract void display();
	
}

class samsung extends mobile{

	@Override
	void camera() {
		// TODO Auto-generated method stub
		System.out.println("It has 108mpx with ultra focus");
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Amoled display");
	}
	
	
}

class nokia extends mobile{

	@Override
	void camera() {
		// TODO Auto-generated method stub
		System.out.println("It has 108+90mpx");
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("It has led display");
	}
	
	void fingerprint () {
		System.out.println("fingerprint is to  announce soon");
	}
	
}

public class Abstraction2example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
nokia n=new nokia();
n.call();
n.camera();
n.display();
n.fingerprint();

System.out.println("..........****...........****..........******");

samsung s=new samsung();
s.call();
s.camera();
s.display();



	}

}
