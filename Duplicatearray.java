package javafullcourse;

public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {1,2,5,5,6,6,7,2};

for(int i=0;i<nums.length-1;i++) {
	for(int j=i+1;j<nums.length;j++) {
		if((nums[i]==nums[j]) && (i !=j) ){
			System.out.println(" Duplicate Number is " + nums[j]);
		}
		
	}
}

	}

}
