package javafullcoursepart3;
class GrandFather {
	public void house() {
		System.out.println("3 bhk house");
	}
}
class father  extends GrandFather {
	public void land() {
		System.out.println("2 acre land");
	}
}
class son extends father{
public	void car() {
		System.out.println(" 1 bmw car ");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
son o =new son();
o.car();
o.house();
o.land();

	}

}


