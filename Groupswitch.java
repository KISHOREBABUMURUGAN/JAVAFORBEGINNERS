
package javafullcourse;
import java .util.Scanner;
public class Groupswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c;
System.out.println("Enter a Character : ");
Scanner sc=new Scanner(System.in);
c=sc.next().charAt(0);


switch(c)

{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
	
	System.out.println(c +" is a vowel ");
	break;
	default :
		System.out.println(c +" is  a consonant ");
		break;
}
	}

}
