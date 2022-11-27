package javafullcourse;
import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : "  );
		int n =sc.nextInt();
		int f=1,z=1,x=1;
		int digit1,digit2,digit3,temp;
		temp=n;
		digit3=temp%10;
         temp=temp/10;
         
         digit2=temp%10;
         temp=temp/10;
         
         digit1=temp%10;
         
         
         for (int i=1; i<=digit3;i++) {
        	 f=f*i;
         }
         for (int j=1; j<=digit2;j++) {
        	 z=z*j;
         }
         for (int k=1; k<=digit1;k++) {
        	 x=x*k;
        	 
        	 
        	 int result=f+z+x;
        	 
        	 if(result==n) {
        		 System.out.println(n+" is a Strong Number ");
        	 }
        	 else {
        		 System.out.println(n+" is not a Strong Number");
        	 }
         }
	}

}
