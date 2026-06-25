class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int p[]=new int[n];
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(s.charAt(j)==c){
                    min=Math.min(min,Math.abs(i-j));
                }
            }
            p[i]=min;
           
        }
        return p;
    }
}