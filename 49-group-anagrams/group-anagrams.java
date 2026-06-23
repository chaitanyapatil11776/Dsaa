class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>ss=new HashMap<>();
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            ss.putIfAbsent(key,new ArrayList<>());
            ss.get(key).add(s);
        }
        return new ArrayList<>(ss.values());
    }
}
