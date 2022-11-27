
package javafullcourse;
import java .util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the limit : ");
Scanner sc=new Scanner(System.in);
int nums;
int i=1;
nums=sc.nextInt();

while(i<=nums) {
	System.out.println(i);
	i++;
}
	}

}


