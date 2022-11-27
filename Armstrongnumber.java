package javafullcourse;
import java.util.Scanner;
public class Armstrongnumber {

	public static void main(String[] args) {
System.out.println("Enter a Number  : ");

		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int  nums; //123
nums=sc. nextInt();
int digit1, digit2,digit3,temp=nums;


digit3=temp%10;  //3
temp=temp/10;  //12

digit2=temp%10;//2
temp=temp/10;//1

digit1=temp%10;//
int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);

if(result==nums) {
	System.out.println(nums+"is a Armstrong Number");
}
else {
	System.out.println(nums+"is not a Armstrong Number");
}

	}

}
