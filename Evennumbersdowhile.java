package javafullcourse;

import java.util.Scanner;

public class Evennumbersdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Limit : ");
		int nums;
		nums=sc.nextInt();
		int i=2;      //i=1 for oddnumbers
		do {
			System.out.println(i);
			i=i+2;
		}while(i<=nums);
	}

}
