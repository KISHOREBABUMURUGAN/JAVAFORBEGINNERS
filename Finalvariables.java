class test{
	final int MIN=1;      //direct installation
	final int NORMAL;
	final int MAX;
	
	test(int normal){            //constructor installation
		this.NORMAL=normal;
		MAX=100;
	}
	void display() {
		System.out.println(MIN);
		System.out.println(NORMAL);
		System.out.println(MAX);
	}
	
}
public class Finalvariables {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
test t=new test(50);
t.display();
	}

}
