package javafullcourse;
import java.util.Scanner;
public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,a,n;
		System.out.println("Enter a Table : ");
		Scanner sc=new Scanner(System.in);
t=sc.nextInt();
System.out.println("Enter a Range : ");
n=sc.nextInt();

for(int i=1;i<=n;i++) {
	a=t*i;
	System.out.println(t+"x"+i+"="+(t*i));
}

	}

}
