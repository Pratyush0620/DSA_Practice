package basic_array;


public class Second_largest {
    public int secondLargestElement(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largest ){
                int temp=largest;
                largest=nums[i];
                second=temp;
            }
            else if(nums[i] < largest && nums[i] > second){
                second=nums[i];
            }
        }
        if(second ==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return second;
        }
    }
}
