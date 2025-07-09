class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }else{
                list.add(nums[i]);
            }
        }
        int ones=n-count;
        for(int i=0;i<ones;i++){
            nums[i]=list.get(i);
        }

        for(int i=ones;i<n;i++){
            nums[i]=0;
        }
    }
}