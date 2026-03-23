class Solution {
    public int mySqrt(int x) {
        int low=0;
        int hight=x;
        int ans=0;
        while(low<=hight)
        {

            int mid=low+(hight-low)/2;
        long ss=(long)mid*mid;
            if(ss==x){
                return mid;
            }else if(ss<x){
                ans=mid;
                low=mid+1;
            }else{
                hight=mid-1;
            }
        }
        return ans;
    }
}