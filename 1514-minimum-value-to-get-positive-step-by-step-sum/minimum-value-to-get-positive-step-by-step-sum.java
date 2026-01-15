class Solution {
    public int minStartValue(int[] nums) {
        
        int n=nums.length;
        int p[]=new int[n];
        p[0]=nums[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+nums[i];
        }
        int mins=p[0];
        for(int j=0;j<n;j++){
           mins= Math.min(mins,p[j]);
        }
        if(mins>=0)return 1;

        return 1-(mins);


    }
}