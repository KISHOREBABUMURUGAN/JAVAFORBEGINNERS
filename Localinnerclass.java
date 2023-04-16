class outerclass{
	void display() {
		class innerclass{
			void innerprint() {
				System.out.println("Myself kishorebabu");
			}
			
		}
		innerclass i=new innerclass();
		i.innerprint();
	}
}
public class Localinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
outerclass o=new outerclass();
o.display();
	}

}
//claa..functio..c;lass