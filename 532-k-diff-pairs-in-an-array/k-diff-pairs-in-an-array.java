class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0)return 0;
        int count=0;
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ss.put(nums[i],ss.getOrDefault(nums[i],0)+1);
        }
        for(int key:ss.keySet()){
            if(k==0){
                if(ss.get(key)>1){
                    count++;
                }
            }else{
                if (ss.containsKey(key + k)){
                    count++;
                }
            }
        }
        return count;
    }
}