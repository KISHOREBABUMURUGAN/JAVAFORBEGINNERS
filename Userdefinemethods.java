package javafullcoursepart2;
class Methods{
	
	//no return,no arguments
	public  void add(){
		int a=12;
		int b=13;
		System.out.println("Addition : "+(a+b));
	}
	//no return,no arguments
	public void sub(int x,int y){
		
		System.out.println("Subtraction : "+(x-y));
	}
	// return,no arguments
	public int mul(){
		int a=12;
		int b=13;
		return a*b;
		
	}
	//return,arguments
	public float div(int x,int y){
		
		return (x/y);
	}
}


public class Userdefinemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods o=new Methods();
o.add();
o.sub(52, 51);
System.out.println("Multiplication : "+o.mul());
System.out.println("Multiplication : "+o.div(12, 12));




	}

}
