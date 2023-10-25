package collections_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new  HashSet();

		//declaration
	//HashSet<String> mset=new HashSet<String>();
//		Set yset=new HashSet();
		
	    set.add(0);
		set.add("kishore");
		set.add(12.0);//heterogeneous
		set.add(20);
		set.add(20);//duplicate not allow
		set.add(null);// single null only allow
		set.add(null);//null allow
		System.out.println("Before removing : "+set.size());
		System.out.println("Before removing : "+set); // randomly integrate the array order 
		
		//insertion add and getting function is not possible because the index is not supported for t
		
		set.remove(12.0);
		System.out.println("After removing : "+set); // randomly integrate the array order 
for(Object ob:set) {
	System.out.println(ob);
}
	}

}
