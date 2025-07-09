package easy_array;

import java.util.ArrayList;
import java.util.HashMap;

public class Union {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(!map.containsKey(nums2[i])){
                map.put(nums2[i],1);
            }

        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int it:map.keySet()){
            list.add(it);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
