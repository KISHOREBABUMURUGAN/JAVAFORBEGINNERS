package collections_1;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hashmap hm=new Hashmap();
		//Map hm=new HashMap();
		Map<Integer, String> hm=new HashMap<Integer, String>();  //key,value
		hm.put(1, "kishore");
		hm.put(1, "kishore");
		hm.put(2, "murugan");
		hm.put(2, "murugan");
		hm.put(7, "murukishore"); // key will not duplicate but value will be duplicate if key duplicate latest value will be updated
		
		hm.put(3, "sruti");
		hm.put(3, "sruti");
		hm.put(5, null);
		hm.put(4, null); 
		hm.put(2, "murukishore"); 
		System.out.println("Before removing : "+hm);//insertion order will be different tyo output console
		System.out.println(hm.size());

System.out.println("Removed String : "+hm.remove(2));  //with key we can remove the value
System.out.println(hm.size());
System.out.println("After removing : "+hm);


System.out.println(hm.get(3));  //passing key we can do the get function

System.out.println(hm.keySet()); //print all the keys from hashmap


for(Object key:hm.keySet()) {
	System.out.println(hm.get(key));	//for print value
}
for(Object key:hm.keySet()) {
	System.out.println(key+"   "+hm.get(key));	//for print key and value
}
}

}
