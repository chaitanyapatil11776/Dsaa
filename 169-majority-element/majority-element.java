class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i:nums){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
        int n=nums.length;
        for(int i:ss.keySet()){
            if(ss.get(i)>n/2){
                return i;
            }
            
        }
        return -1;
        
    }
}