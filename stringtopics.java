package javafullcoursepart2;

public class stringtopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Kishorebabu";
String b="murugan";
System.out.println("A           : " +a );
System.out.println("B           : " +b );
System.out.println("A hashcode  : " +a.hashCode() );
System.out.println("B hashcode  : " +b.hashCode() );
System.out.println("A equal     : " +a.equals(b) );
System.out.println("A equal ignore case : " +a.equalsIgnoreCase(b) );
System.out.println("A Length    : " +a.length() );
System.out.println("A Uppercase : " +a.toUpperCase() );
System.out.println("A Lowercase : " +a.toLowerCase() );
System.out.println("A Replcae   : " +a.replace("Kishorebabu","Murugan") );
System.out.println("A Contains  : " +a.contains("Kishorebabu") );
System.out.println("A is empty  : " +a.isEmpty() );
System.out.println("A character : " +a.charAt(0) );
System.out.println("A endwith   : " +a.endsWith("bu") );
System.out.println("A Startwith : " +a.startsWith("Ki") );
System.out.println("A Substring : " +a.substring(5) );
System.out.println("A Startwith : " +a.substring(0,5) );
System.out.println("A Character : " +a.substring(0,5) );
char carray[]=a.toCharArray(); 
for(char c:carray) {
	System.out.print(c+" ");
}


String c=" sivakami ";
;
System.out.println(c.length());
System.out.println(c);
System.out.println(c.trim());
System.out.println(c.trim().length());


























	}

}
