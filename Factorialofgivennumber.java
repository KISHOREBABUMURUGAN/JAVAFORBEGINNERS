package javafullcourse;
import java.util.Scanner;
public class Factorialofgivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a Number : ");
int nums;
Scanner sc=new Scanner(System.in);
nums=sc.nextInt();
int f=1;

for(int i=1;i<=nums;i++) {

	f=f*i;
}
System.out.println("The Factorial of "+nums+ " is " +f);



	}

}
