package javafullcoursepart3;
interface interdemo{
	final static int A=4;
	
	void fun1();
	void fun2();
	
	public static void fun3() {              //static potta ullaye function eluthalam
		System.out.println("fun3");
	}
	
	default  void fun4() {
		System.out.println("fun 4");           //default use panna implements la poda thevaila   ellam error katathu
	}
	
	private  void fun5() {
		System.out.println("fun 5");           //function podalam body podlaam 
	}
}

interface interdemo2 extends interdemo{
	
	void fun6();
	
}

class testcenter implements interdemo2{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("fun1");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("Fun 2");
	}

	@Override
	public void fun6() {
		// TODO Auto-generated method stub
		System.out.println("fun 6");
	}
	
}
public class Interfacemodedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
testcenter t=new testcenter();
t.fun1();
t.fun2();
t.fun4();
t.fun6();
interdemo.fun3();

	}

}
