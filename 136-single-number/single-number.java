class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i:nums){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
        for(int i:ss.keySet()){
            if(ss.get(i)==1){
                return i;
            }
        }
        return -1;

    }
}