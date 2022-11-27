package javafullcourse;
import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
int n;
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter a Number : ");
int reverse=0,rem;
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
reverse=(reverse*10)+rem;
n=n/10;
}
System.out.println("your Reverse number as follows : "+reverse);
	}

}
