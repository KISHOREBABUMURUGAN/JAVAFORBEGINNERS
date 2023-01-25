package javafullcoursepart3;
class methodoverloading{
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static double multiply(double a,double b) {
		return a*b;
	}
	public static double multiply(double a,int b) {
		return a*b;
	}
	public static int multiply(int r) {
		return r*r;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(methodoverloading.multiply(10, 20));


System.out.println(methodoverloading.multiply(10.5, 20.4));
System.out.println(methodoverloading.multiply(10.6, 220));
System.out.println(methodoverloading.multiply(20));
	}

}
