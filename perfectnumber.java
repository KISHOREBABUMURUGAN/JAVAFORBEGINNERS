package javafullcourse;
import java.util.Scanner;
public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number : ");
nums=sc.nextInt();
int sum=0;
for (int i=1;i<nums;i++) {
	if(nums%i==0) {
		sum=sum+i;
	}
}
	if(sum==nums) {
		System.out.println(nums+" is a perfect number ");
	}
	else {
		System.out.println(nums+"it is not  a perfect number");
	
}
	}

}
