class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();


        int dp[][]=new int[n][n];
        return ss(s,0,s.length()-1,dp);
    }

    int ss(String s,int l,int  r,int dp[][]){
       
       if(dp[l][r]!=0){
        return dp[l][r];
       }
        if(l>r)return 0;
        if(l==r)return 1;
        if(s.charAt(l)==s.charAt(r)){
           return dp[l][r]=2 + ss(s,l+1,r-1,dp);
        }else{
           return dp[l][r]= Math.max((ss(s,l+1,r,dp)),ss(s,l,r-1,dp));
        }
        
    }
}