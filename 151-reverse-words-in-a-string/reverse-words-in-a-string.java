class Solution {
    public String reverseWords(String s) {
        String a[]=s.split("\\s+");
        ArrayList<String>ss=new ArrayList<>();
        for(String p:a){
            if(!p.isEmpty()){
                ss.add(p);
            }
        }
        Collections.reverse(ss);
        return String.join(" ",ss);
    }
}