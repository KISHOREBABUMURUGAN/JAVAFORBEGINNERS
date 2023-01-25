package javafullcoursepart3;
class user{
	String name;
	int age;
	public user(String n,int a) {
		this.name =n;
		this.age =a;
		
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
}
class mainprogrammer extends user{
	String companyname;
	mainprogrammer(String n,int a ,String c){
		super(n,a);
		this.companyname=c;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(companyname);
	}
	
}
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mainprogrammer o=new mainprogrammer("Kishore",22,"capgemini");
o.display();
	}

}
