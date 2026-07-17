class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        HashSet<Integer>sb=new HashSet<>(ss.values());
        
        return sb.size()==1;
    }
}