class Solution {
    public int singleNumber(int[] nums) {
    HashMap<Integer,Integer>ss=new HashMap<>();
    for(int p:nums){
        ss.put(p,ss.getOrDefault(p,0)+1);

    }
    for(int pp:ss.keySet()){
        if(ss.get(pp)==1)return pp;
    }
    return -1;
    }
}