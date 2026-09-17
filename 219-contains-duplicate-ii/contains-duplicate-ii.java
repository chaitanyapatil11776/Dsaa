class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>ss=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!ss.add(nums[i])){
                return true;
            }
            if(ss.size()>k){
                ss.remove(nums[i-k]);
            }
        }
        return false;
    }
}