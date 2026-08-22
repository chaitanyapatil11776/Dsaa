class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        ArrayList<Character>aa=new ArrayList<>(ss.keySet());
        Collections.sort(aa,(a,b)->ss.get(b)-ss.get(a));
        StringBuilder sb=new StringBuilder();
        for(char a:aa){
            for(int i=0;i<ss.get(a);i++){
                sb.append(a);
            }
        }
        return sb.toString();
        
        
    }
}