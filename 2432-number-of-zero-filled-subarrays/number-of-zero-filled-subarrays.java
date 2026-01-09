class Solution {
    public long zeroFilledSubarray(int[] nums) {
    long ans=0;
    long  c=0;
        for(int nn:nums){
            if(nn==0){
                c++;
                ans+=c;
            }else{
                c=0;
            }
        }
        return ans;
    }
}