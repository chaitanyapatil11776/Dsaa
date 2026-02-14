class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=arr[i]%k;
            if(rem<0)rem+=k;
            ss.put(rem,ss.getOrDefault(rem,0)+1);
        }
        for(int nn:ss.keySet()){
            int fr=ss.get(nn);
            if(nn==0){
                if(fr%2!=0){
                    return false;
                }}
                else if(2*nn==k){
                    if(fr%2!=0)return false;
                }else{
                 int com=ss.getOrDefault(k-nn,0);
                 if(com!=fr)return false;
                }
            }
           return true;
        }
       
    }
