class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(ss(word)){
                return word;
            }
        }
        return "";
    }
    boolean ss(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
} 