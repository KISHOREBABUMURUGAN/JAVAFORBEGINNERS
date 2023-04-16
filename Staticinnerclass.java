class velia{
static	int x=20;
	int y=30;
	static class ulla{
		void display() {
			System.out.println("Java is explained - " +x+" version");
		}
	}
}
public class Staticinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated me	
		velia.ulla v=new velia.ulla();
	v.display();
}
}// ztatic than static la use panna mudium