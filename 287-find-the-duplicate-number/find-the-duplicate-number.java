class Solution {
    public int findDuplicate(int[] nums) {
        // int n=nums.length;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(nums[i])){
        //         return nums[i];             ///Using HashMap
        //     }
        //     map.put(nums[i],1);
        // }
        // return -1;

        int n=nums.length;
        boolean[] arr=new boolean[n+1];
        for(int i=0;i < n;i++){
            if(arr[nums[i]]){
                return nums[i];
            }
            arr[nums[i]]=true;
        }

        return -1;
        }
        
    }