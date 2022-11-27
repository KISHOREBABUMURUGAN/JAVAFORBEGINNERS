package javafullcourse;
import java.util.Scanner;
//single dimension array
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		System.out.println(a[2]);
		
		for(int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
		}  //for loop printing
		
		for(int number : a) {
			System.out.println(number);
		}//enhanced for loop
		

		int b[]=new int [10];
		for(int number : b) {
			System.out.println(number);
		}        //space for 10 numbers
		

int c[]=new int [10];
for(int i=0;i<10;i++) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number : ");
c[i]=sc.nextInt();
}



for(int number : c) {
	System.out.println(number);
}


		
		
		
		
	}

}
