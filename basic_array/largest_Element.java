package basic_array;
public class largest_Element {
    public int largestElement(int[] nums) {
        int largest=nums[0];
        for(int i=1;i<nums.length;i++){
            if (nums[i] > largest){
                largest=nums[i];
            }
        }
        return largest;
    }
}
