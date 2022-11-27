package javafullcourse;
import java.util.Scanner;
public class Breakcontinue {

	public static void main(String[] args) {
System.out.println("Enter a Limit number : ");
Scanner sc=new Scanner(System.in);
int nums;
nums=sc.nextInt();

for(int i=1;i<=nums;i++) {
	if(i==5)
		continue;
	System.out.println(i);
	if(i==8) 
		break;
}

	}

}
