package javafullcourse;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		char marital,gender;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Marital status M/U");
marital=sc.next().charAt(0);

if(marital=='U' || marital=='u') {
	
System.out.println("Enter your age : ");
age=sc.nextInt();

System.out.println("Enter your Gender M/F : ");
gender=sc.next().charAt(0);
if((gender=='m'||gender=='M')&& age>=30 ) {
	System.out.println("You are eligible for insurance");
}
else if((gender=='f'||gender=='F')&& age>=25 ) {
	System.out.println("You are eligible for insurance");
}

else {
	System.out.println("You are not eligible for insurance");
}

}














else if(marital=='M' || marital=='m') 
{
	System.out.println("You are eligible for a insurance");
}

else {
	System.out.println("Invalid input");
}
}

}
