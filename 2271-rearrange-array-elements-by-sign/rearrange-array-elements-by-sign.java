class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list_p=new ArrayList<>();
        ArrayList<Integer> list_n=new ArrayList<>();
        if(n==2 && nums[0] > 0 && nums[1] < 0){
            return nums;
        }
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                list_p.add(nums[i]);
            }else{
                list_n.add(nums[i]);
            }
            
        }
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=list_p.get(j);
                j++;
            }else{
                nums[i]=list_n.get(k);
                k++;
            }
        }
        return nums;
    }
}