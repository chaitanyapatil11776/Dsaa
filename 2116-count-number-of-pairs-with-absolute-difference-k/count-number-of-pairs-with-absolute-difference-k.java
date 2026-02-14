class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int hh:nums){
            count+=ss.getOrDefault(hh+k,0);
            count+=ss.getOrDefault(hh-k,0);
            ss.put(hh,ss.getOrDefault(hh,0)+1);
        }
        return count;
        
    }
}