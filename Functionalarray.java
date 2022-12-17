

package javafullcoursepart2;
import java.util.Scanner;
import java.util.Arrays;
public class Functionalarray {

	public static int[] ascending(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Limit : ");
		int a=sc.nextInt();
		int []b=new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter a  "+i+" "
					+ "value");
			b[i]=sc.nextInt();
			
		}
		Arrays.sort(b);
		return b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=ascending();
		for(int a:arr) {
			System.out.println(a);
		}

	}

}
