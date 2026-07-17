class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char a:s.toCharArray()){
            ss.put(a,ss.getOrDefault(a,0)+1);
        }


    List<Character>list=new ArrayList<>(ss.keySet());
   Collections.sort(list,(a,b)->ss.get(b)-ss.get(a));
StringBuilder sb=new StringBuilder();
for(char c:list){
   for(int i=0;i<ss.get(c);i++){
    sb.append(c);
   }
}

return sb.toString();


    }
}