class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max=0;
        int sum=0;
        int left=0;
        HashSet<Integer>ss=new HashSet<>();
        for(int right=0;right<nums.length;right++){

            while(ss.contains(nums[right])){
                ss.remove(nums[left]);
                sum-=nums[left];
                
                left++;
            }
            ss.add(nums[right]);
            sum+=nums[right];
            max=Math.max(max,sum);
           
        }
        return max;
    }
}