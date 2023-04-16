class staticvariable{
	static int a =10; //common for all 
	int b=20;        // applied for change on;y 
	void show() {
		System.out.println("print A : " + a + " Print B : "+b);
	
	}
	static void display() {
		System.out.println("print A : "+a);
	}
}
public class Statictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
staticvariable o1=new staticvariable();
o1.show();

staticvariable o2=new staticvariable();

o2.show();


o2.b=100;
o2.a=200;
o2.show();
o1.show();


	}

}
