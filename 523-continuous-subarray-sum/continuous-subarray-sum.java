class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    int sum=0;
    HashMap<Integer,Integer>ss=new HashMap<>()    ;
    ss.put(0,-1);
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        int rem=(k==0)?sum:sum % k;
        if(ss.containsKey(rem)){
            int index=ss.get(rem);
            if(i-index>=2)return true;
          
        }
          else{
                ss.put(rem,i);
            }
    }
    return false;
    }
}