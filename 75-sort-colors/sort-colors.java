import java.util.Collections;
class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i:nums){
            if(i==0) count0++;
            else if (i==1) count1++;
            else count2++;
        }

        for(int i=0;i<count0;i++){
            nums[i]=0;
        }
        for(int j=count0;j<(count0+count1);j++){
            nums[j]=1;
        }
        for(int i=(count0+count1);i<nums.length;i++){
            nums[i]=2;
        }
    }
}