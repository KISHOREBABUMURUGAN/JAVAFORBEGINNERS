package javafullcourse;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Limit : ");
		int nums;
		nums=sc.nextInt();
		
		for(int i=1;i<=nums;i++) {
			System.out.println(i);
		}
	}

}
