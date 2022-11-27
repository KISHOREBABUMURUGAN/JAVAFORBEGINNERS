package javafullcourse;

public class Jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{10,20,30,100},
				{40,50,60},
				{70,80,90,110}
		};
for(int i=0 ;i<a.length;i++) {
	for(int j=0 ;j<a[i].length;j++) {
		System.out.print(" "+ a[i][j]);
	}
	System.out.println(" ");
}
	}

}
