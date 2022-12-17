package javafullcoursepart2;
import java.util.Arrays;
import java.util.Scanner;
public class Decimaltobinarynumber {
	
	public static void decimal2Binary(int n) {
		int [] binaryNum=new int[1000];
		int i=	0;
		while(n>0) {
				
					binaryNum[i]=n%2;
					n=n/2;
					i++;
					
		}
		
		for(int j=i-1;j>=0;j--) {
		System.out.println(binaryNum[j]);
		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a decimal number : ");
int a=sc.nextInt();
System.out.println("Decimal number : "+a);
System.out.println("Binary number : ");
//decimal2Binary(n);



	}
}
