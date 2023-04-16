interface outerdemos{
	void number();
}

class innerdemos{
	void display() {
		outerdemos o =new outerdemos() {

			@Override
	public		void number() {
				// TODO Auto-generated method stub
				System.out.println("Thala");
			}
			
		};
		o.number();
	}
}
public class anonymousinterfaceinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
innerdemos i =new innerdemos();
i.display();
	}

}
//interface class used in another class is called anonymous inner class