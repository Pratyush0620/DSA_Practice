class Solution {
    public int singleNumber(int[] nums) {
        // int n=nums.length;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(nums[i])){
        //        map.put(nums[i],map.get(nums[i])+1);
        //     }else{
        //         map.put(nums[i],1);
        //     }
            
        // }                                                 //Using HashMap so extra space is here
        
        // for(int key:map.keySet()){
        //     if(map.get(key)==1){
        //         return key;
        //     }
        // }
        // return -1;


        //Using XOR bit manipulation technique

        int result=0;
        for(int num:nums){
            result ^=num;
        }
        return result;
    }
}