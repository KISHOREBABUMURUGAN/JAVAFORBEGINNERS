package javafullcourse;
import java .util.Scanner;
public class Elseifgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float avg;
System.out.println("Enter the Average Mark : ");
Scanner sc = new Scanner (System.in);
avg=sc.nextFloat();

if(avg>=90 && avg<=100) {
	System.out.println("Grade A");
}
else if(avg>=80 && avg<=89.9) {
	System.out.println("Grade B");
}
else if(avg>=70 && avg<=79) {
	System.out.println("Grade C");
}
else  {
	System.out.println("Grade D");
}

	}

}
