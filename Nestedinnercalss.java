class outer{
	int a=12;
	class inner{
		int b=24;
		void innerdisplay() {
			System.out.println(a);
			System.out.println(b);
		}
	}
	void outerdisplay() {
		 inner i =new inner();
		 i.innerdisplay();
		 System.out.println(".....***ok google***.....");
	}
}
public class Nestedinnercalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
outer o=new outer();
o.outerdisplay();
outer.inner  p=new outer().new inner();
p.innerdisplay();
	}

}
