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
                count++;
            }
       }
       for(int i=0;i<count;i++){
        nums[i]=list.get(i);
       }
       return count;

    }
}