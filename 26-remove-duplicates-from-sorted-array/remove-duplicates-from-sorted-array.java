class Solution {
    public int removeDuplicates(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       ArrayList<Integer> list=new ArrayList<>();
       int n=nums.length;
       int count=0;
       for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
                list.add(nums[i]);
                count++;                   //Using HashMap and ArrayList
            }
       }
       for(int i=0;i<count;i++){
        nums[i]=list.get(i);
       }
       return count;
        
        // HashSet<Integer> set=new HashSet<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     set.add(nums[i]);
        // }
        // int k=set.size();
        // int j=0;
        // for(int x:set){
        //     nums[j++]=x;
        // }
        // return k;
    }
}