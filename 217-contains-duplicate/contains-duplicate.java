class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>ss=new HashSet<>();
        for(int m:nums){
            if(!ss.add(m)){
                return true;
            }
        }
        return false;
    }
}