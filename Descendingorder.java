package javafullcourse;

import java.util.Arrays;

public class Descendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[] {2,5,6,8,71,63,15,35};
		 int temp;
		  for(int i=0;i<nums.length;i++) {
			  for(int j=i+1;j<nums.length;j++) {
				  if(nums[i]<nums[j]) {
					  temp=nums[i];
					  nums[i]=nums[j];
					  nums[j]=temp;
				  }
				  
			  }
		  }
		System.out.println("Ascending order : "+Arrays.toString(nums));

	}

}
