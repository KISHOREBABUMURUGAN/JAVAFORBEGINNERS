package javafullcourse;
import java.util.Scanner;
public class Twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
for(int i=0 ;i<3;i++) {
	for(int j=0 ;j<3;j++) {
		System.out.print(" "+ a[i][j]);
	}
	System.out.println(" ");
}
//int [][]b=new int[10][10];
//int [][][]c=new int[10][10][10];
//b[0][0]=10;
//int i,j;

Scanner sc=new Scanner(System.in);
int d;
for(int i=0;i<=10;i++) {
	
		System.out.println("Enter a["+i+"] value : ");
		 d=sc.nextInt();
	
		
	
}




	}

}



