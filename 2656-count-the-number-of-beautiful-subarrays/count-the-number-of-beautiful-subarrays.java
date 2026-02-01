class Solution {
    public long beautifulSubarrays(int[] nums) {
        int n=nums.length;
        long p[]=new long[n];
    long count=0;
        p[0]=nums[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]^nums[i];
        }
        HashMap<Long,Integer>ss=new HashMap<>();
        ss.put(0L,1);
        for(int i=0;i<n;i++){
            long val=p[i];
            if(ss.containsKey(val)){
                count+= (long)ss.get(val);
            }
            ss.put(val,ss.getOrDefault(val,0)+1);
        }
        return count;

    }
}