package collections_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new  ArrayList();

//declaration
//ArrayList<String>list=new ArrayList<String>();
//  List mlist=new ArrayList();




list.add(0);
list.add("kishore");
list.add(12.0);//heterogeneous
list.add(20);
list.add(20);//duplicate allow
list.add(null);//null allow
list.add(null);//null allow

/*Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  */

System.out.println("Before removing : "+list.size());
System.out.println("Before removing : "+list); //insertion order will be replicate same

list.remove(0);
System.out.println("AFter removing : "+list.size());
System.out.println("AFter removing : "+list);
list.add(0, "Murugan");
System.out.println("AFter adding : "+list);

System.out.println(list.get(0))		;

for(Object obj:list) {
	System.out.println(obj); 
}

System.out.println("Get : "+list.get(3));
list.clear();
System.out.println("After clearing : "+list);

	}

}
