class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)-1);
        }
        for(int a:ss.values()){
            if(a!=0){
                return false;
            }
        }
        return true;
    }
}