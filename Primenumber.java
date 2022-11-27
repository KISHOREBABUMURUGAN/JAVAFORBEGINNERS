package javafullcourse;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number : ");
int n=sc.nextInt();
int f=0;
for(int i=1; i<=n; i++) {
	if(n%i==0) {
		f++;
	}
}
	 if(f==2){
		System.out.println(n+ " is a prime number");
	
		
	}
	 else {
		 System.out.println(n+"is not a prime number");
		 
	 
	 }
	}
}
	
	

