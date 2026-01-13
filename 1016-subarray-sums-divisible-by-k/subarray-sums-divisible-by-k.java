class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int p[]=new int [n];
        int count=0;
        p[0]=nums[0];
        HashMap<Integer,Integer>mm=new HashMap<>();
        mm.put(0,1);
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+nums[i];
        }
        for(int j=0;j<n;j++){
            // if(p[j]%k==0)count++;
            int val=p[j]%k;
            if(val<0)val+=k;
            if(mm.containsKey(val)){
                count+=mm.get(val);
            }
            mm.put(val,mm.getOrDefault(val,0)+1);
        }
        return count;
    }
}