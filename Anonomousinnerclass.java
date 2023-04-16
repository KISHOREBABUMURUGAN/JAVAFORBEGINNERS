

   abstract class outerdemo{
abstract	void number();
}

class innerdemo{
	void display() {
		outerdemo o =new outerdemo() {

			@Override
			void number() {
				// TODO Auto-generated method stub
				System.out.println("Thala");
			}
			
		};
		o.number();
	}
}
public class Anonomousinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
innerdemo i =new innerdemo();
i.display();
	}

}
//abstract class used in another class is called anonymous inner class