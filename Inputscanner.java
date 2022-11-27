package javafullcourse;
import java.util.Scanner;
public class Inputscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
		float a,b,c;
		System.out.println("Enter two numbers : " );
		//a=sc.nextInt();
		//b=sc.nextInt();
		a=in.nextFloat();
		b=in.nextFloat();
		c=(a*a)+(b*b)+(2*a*b);
		System.out.println("The Result is " +c); 
		

	}

}
//sc.next(); for a single word ex:ram
//sc.nextLine(); for a single sentence     nextDouble
