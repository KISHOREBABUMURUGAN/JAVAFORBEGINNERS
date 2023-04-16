  class blocktest{
	  static {
		  System.out.println("block 3*");
	  }
	  static {
		  System.out.println("block 4*");
	  }
  }
public class Staticblocks {
static {
	System.out.println("block 1*");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blocktest b=new blocktest();
System.out.println("Main block*");
	}
	static {
		System.out.println("block 2*");
	}

}
