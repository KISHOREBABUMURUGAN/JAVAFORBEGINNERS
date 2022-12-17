package javafullcoursepart2;

public class StringbufferStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sc=new StringBuffer("KISHORE");
System.out.println(sc);
sc.append("BABU");
System.out.println(sc);
sc.insert(11," COMPUTER");
System.out.println(sc);
sc.replace(11,12,"@");
System.out.println(sc);
sc.delete(0, 5);
System.out.println(sc);
sc.reverse();
System.out.println(sc);
System.out.println(sc.charAt(10));
System.out.println(sc.length());
System.out.println(sc.substring(5)); 
System.out.println(sc.substring(0,5)); //(0-index,5-how many)
sc.setCharAt(0, '@');
System.out.println(sc);








	}

}
