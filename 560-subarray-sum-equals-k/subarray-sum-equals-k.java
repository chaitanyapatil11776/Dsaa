class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int p[]=new int[nums.length];
       p[0]=nums[0];
       for(int i=1;i<nums.length;i++){
        p[i]=p[i-1]+nums[i];
       }
       HashMap<Integer,Integer>ss=new HashMap<>();
       ss.put(0,1);
       for(int i=0;i<nums.length;i++){
        int val=p[i]-k;
        if(ss.containsKey(val)){
            count+=ss.get(val);
        }
        ss.put(p[i],ss.getOrDefault(p[i],0)+1);

       }
       return count;

    }
}