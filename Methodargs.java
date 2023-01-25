package javafullcoursepart3;

public class Methodargs {
public static void getnames(String... names) {
	for(String name:names)
	System.out.println(name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
getnames("kishore","babu","vishnuram","murugan","sairam","vihitha","sivakami");
	}

}
