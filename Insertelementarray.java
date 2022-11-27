package javafullcourse;

import java.util.Arrays;

public class Insertelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {10,20,30,40,50,60,70,80,90,100};
int index=2;
int value=55;

for(int i=nums.length-1;i>index;i-- ) {
	nums[i]=nums[i-1];
	
}
	nums[index]=value;	
	
	System.out.println(Arrays.toString(nums));
		
		
	}

}
