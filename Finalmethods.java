class methods{
	public void display() {
		System.out.println("This is a Main method");
	}
	final void finaldisplay() {
		System.out.println("This is one of method");
	}
}
class submethod extends methods{
 public void display() {
	 System.out.println("This is extend method");
 }

//cannot be override the  final function
}

public class Finalmethods {
  public static void main(String []args) {

	  submethod s=new submethod();
	  s.display();
	  s.finaldisplay();
	
			  
	  
	  
	  
	 
	  
	  
	  
	  
  }
}





