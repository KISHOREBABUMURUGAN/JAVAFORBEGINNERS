package javafullcourse;
import java.util.Scanner;
public class Dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Limit : ");
int nums;
nums=sc.nextInt();
int i=1;
do {
	System.out.println(i);
	i++;
}while(i<=nums);
	}

}
