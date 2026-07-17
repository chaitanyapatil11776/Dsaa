class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer>s1=new HashMap<>();
        HashMap<Character,Integer>s2=new HashMap<>();
        for(char a:word1.toCharArray()){
            s1.put(a,s1.getOrDefault(a,0)+1);
        }
        for(char a:word2.toCharArray()){
            s2.put(a,s2.getOrDefault(a,0)+1);
        }

        for(char c='a';  c<='z';c++){
            int f1=s1.getOrDefault(c,0);
            int f2=s2.getOrDefault(c,0);
            if(Math.abs(f1-f2)>3){
                return false;
            }
        }
        return true;
    }
}