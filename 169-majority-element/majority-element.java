class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int a:nums){
            ss.put(a,ss.getOrDefault(a,0)+1);
        }
        int n=nums.length;
        for(int aa:nums){
            if(ss.get(aa)>n/2){
                return aa;
            }
        }
        return -1;
    }
}