package javafullcourse;

public class Jaggedarrayenhancedforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {
		{10,20,30,40},
		{50,60,70},
		{80,90,100,110}
};

for(int element []:a) {
	for(int print:element) 
	{
		System.out.print(" "+print);
	}
	System.out.println("");
}


	}

}
