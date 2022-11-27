package javafullcourse;
import java.util.Scanner;
public class Oddevenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=0 ,o=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Limit : ");
int n=sc.nextInt();

int a[]=new int[n];
for (int i=0;i<n;i++) {
	System.out.println("Enter a["+i+"]value");
	a[i]=sc.nextInt();
}
for(int element:a) {
	if(element%2==0) {
		e++;
	}
	else {
		o++;
	}
}
System.out.println("Total Odd numbers : "  +o);
System.out.println("Total even numbers : "  +e);


	}

}
