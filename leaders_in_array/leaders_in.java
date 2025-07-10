package leaders_in_array;

import java.util.ArrayList;
import java.util.Collections;

public class leaders_in {
    public ArrayList<Integer> leader(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int check=nums[n-1];
        list.add(check);
        for(int i=n-2;i>=0;i--){ 
             if(nums[i] > check){
                list.add(nums[i]);
                check=nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
