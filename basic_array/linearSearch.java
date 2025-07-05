package basic_array;

public class linearSearch {
    public int linearSearch1(int nums[], int target) {
	   //Your code goes here
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
          return i;
        }
      }
      return -1;
    }
}
