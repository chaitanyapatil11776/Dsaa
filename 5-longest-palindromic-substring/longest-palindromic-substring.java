class Solution {

    boolean ss(String s,int l,int r){
        while(l<r){
            char a=s.charAt(l);
            char b=s.charAt(r);
            if(a!=b){
                return false;
           }
           l++;
           r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        
        int start=0;
        int end=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(ss(s,i,j)==true){
                    if((j-i+1)>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}