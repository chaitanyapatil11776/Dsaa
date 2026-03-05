class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>ss=new HashSet<>();
        for(int a:nums){
            if(!ss.add(a)){
                return a;
            }
        }
        return -1;
    }
}