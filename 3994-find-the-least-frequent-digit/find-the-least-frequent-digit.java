class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>ss=new HashMap<>();
        while(n!=0){
            int digit=n%10;
            ss.put(digit,ss.getOrDefault(digit,0)+1);
            n/=10;

        }
        int ans=9;
        int min=Integer.MAX_VALUE;
        for(int a:ss.keySet()){
            int fre=ss.get(a);
            if(fre<min ){
               min=fre;
               ans=a;

            }else if(fre==min && a<ans){
                ans=a;
            }
        }
        return ans;
        
    }
}