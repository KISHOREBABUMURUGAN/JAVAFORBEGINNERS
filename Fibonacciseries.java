package javafullcourse;
import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int n=sc.nextInt();
int a=-1,b=1,c;
int sum=0;

for(int i=1;i<=n;i++)//1<=5 2<=5 3<=5 4<=5 5<=5 
{
c=a+b;  //0 1 1 2 3
System.out.println(c);  //0 1 1 2 3
a=b;   //1 0 1 1 2
b=c;  //0 1 1 2 3

//if we add fibonacci series it include otherwise left it.
sum=sum+c;

}
System.out.println("The addition of fibonaci numbers " + sum);

	}

}
