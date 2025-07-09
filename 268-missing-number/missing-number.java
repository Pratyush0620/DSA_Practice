class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int missing=-1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=list.get(i)){
                missing=list.get(i);
                break;
            }
        }
        if(missing==-1){
            missing=nums[n-1]+1;
        }
        return missing;
    }
}