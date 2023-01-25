package javafullcoursepart3;
class shaperectangle{
  private int length,width;
  
  int getlength() {
	  return length;
  }
  int getwidth() {
	  return width;
  }
  void setlength(int l) {
	  if(l>0) 
	length=l;
	  else
		  length=0;
	  
  }
  void setwidth(int w) {
	  if(w>0) 
	  width=w;
	  else 
		 width=0;
	  
	  
  }
  int area() {
	  int a =length*width;
	  return a;
	  
  }
  
}
public class Gettersetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shaperectangle o=new shaperectangle();
o.setlength(10);
o.setwidth(20);
System.out.println("Length : " + o.getlength());
System.out.println("Width : " + o.getwidth());
System.out.println("Area of a rectangle : " + o.area());
	}

}
