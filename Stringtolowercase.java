package javafullcoursepart2;

public class Stringtolowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder a=new StringBuilder("ABCDEF");
		System.out.println(a);
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=65 &&a.charAt(i)<=90) {
				int b=(int)a.charAt(i)+32;  //97-32=65 is a uppercase
				a.setCharAt(i,(char)b );
			}
		}
		System.out.println(a);
	}

}
