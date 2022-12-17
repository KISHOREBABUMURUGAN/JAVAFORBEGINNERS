package javafullcoursepart2;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder a=new StringBuilder("KISHOREBABU");
StringBuilder b=new StringBuilder();

for(int i=a.length()-1;i>=0;i--) {
	b.append(a.charAt(i));
}
System.out.println(b);
	}

}
