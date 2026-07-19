class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i:nums){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
        for(int a:ss.keySet()){
            if(ss.get(a)==1){
                return a;
            }
        }
        return -1;
    }
}