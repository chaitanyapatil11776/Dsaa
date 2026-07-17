class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer>s1=new HashMap<>();
        HashMap<String,Integer>s2=new HashMap<>();
        for(String a:words1){
            s1.put(a,s1.getOrDefault(a,0)+1);
        }
        for(String a:words2){
            s2.put(a,s2.getOrDefault(a,0)+1);
        }
        int count=0;

        for(String pp:words1){
            if(s1.get(pp)==1 &&  s2.getOrDefault(pp,0)==1){
                count++;
            }
        }
        return count;
    }
}