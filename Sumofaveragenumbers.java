package javafullcourse;
import java.util.Scanner;
public class Sumofaveragenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int nums;
		System.out.println("Enter a Limit : ");
		Scanner sc=new Scanner(System.in);
		nums=sc.nextInt();
		int sum=0,a;
		for(int i=1;i<=nums;i++) {
			System.out.println("Enter a " +i+ "Number");
			a=sc.nextInt();
			
			sum=sum+a;
			
		}
		System.out.println("Addition of all numbers : "+sum);
		System.out.println("Average of all numbers : "+sum/nums);
	}

}
