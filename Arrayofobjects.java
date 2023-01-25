package javafullcoursepart3;

class students{
	public int Rollnumber;
	public String Name;
	
	public students(int rollnumber,String name) {
                 this.Rollnumber=rollnumber;
                 this.Name=name;
	}
	void print(){
		System.out.println("Name : "+Name);
		System.out.println("Rollnumber :"+Rollnumber );
		System.out.println(".......!...........!");
		
	}
	
	
	
}

public class Arrayofobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		students o=new students(10,"Raja");
		o.print();
		
		students [] p=new students[6];
		p[0]=new students(20,"Kishore");
		p[1]=new students(30,"Babu");
		p[2]=new students(40,"Sruti");
		p[3]=new students(50,"Vihitha");
		p[4]=new students(60,"Murugan");
		p[5]=new students(70,"Sivakami");
		
		for(int i=0;i<p.length;i++) {
			p[i].print();
		}
		

	}

}
