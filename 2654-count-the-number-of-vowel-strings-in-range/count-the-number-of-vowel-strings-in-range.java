class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String ss=words[i];
            char first=ss.charAt(0);
            char last=ss.charAt(ss.length()-1);
            if(vowel(first) && vowel(last)){
                count++;
            }
        }
        return count;
    }
    boolean vowel(char ch){
     return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}