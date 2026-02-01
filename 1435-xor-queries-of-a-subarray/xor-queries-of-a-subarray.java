class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int p[]=new int[n];
        p[0]=arr[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]^arr[i];
        }

        int re[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];

            if(l==0){
                re[i]=p[r];
            }else{
                re[i]=p[r]^p[l-1];
            }
        }
        return re;
        
    }
}