class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(ss.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
   
   
   
    }
}