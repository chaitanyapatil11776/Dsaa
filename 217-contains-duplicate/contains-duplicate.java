class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>ss=new HashSet<>();
        for(int i:nums){
            if(!ss.add(i)){
                return true;
            }
            
        }
         return false;
     
    }
}