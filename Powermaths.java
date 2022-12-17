package javafullcoursepart2;
class mathematical{
	
	public static int power(int x,int y){  //x-base y-power
int result=1;
for(int i=1;i<=y;i++) {
	result=result*x;
	
}
return result;
    
	}
}

public class Powermaths {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(mathematical.power(10, 2));
	  
	}
}