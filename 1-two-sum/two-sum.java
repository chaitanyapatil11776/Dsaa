class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(ss.containsKey(diff)){
                return new int[]{ss.get(diff),i};
            }
                ss.put(nums[i],i);
            
        }

        return new int[]{};
    }
}