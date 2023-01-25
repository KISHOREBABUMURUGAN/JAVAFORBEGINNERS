package javafullcoursepart3;
class demo{
	
	private int m,n;
	
	demo(int x,int y){
		m=x;
		n=y;
	}
	
	int larger() {
		if(m>n) 
			return m;
		else
			
		return n;
	}
	void display() {
		int large=larger();
		System.out.println("The Greatest number is : "+large);
	}
	
	
	
}
public class Nestingofmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo o=new demo(30,20);
o.display();
	}

}
