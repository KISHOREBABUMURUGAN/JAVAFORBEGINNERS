package javafullcoursepart3;
class father{        //base
	void house() {
		System.out.println("i have 2bhk house");
	}
}
class son extends father{           //derived
	
	void car() {
		System.out.println("Its my BMW");
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
son o=new son();
o.car();
o.house();
	}

}
