class Solution {
    public String reverseWords(String s) {
        String c[]=s.split("\\s+");
        ArrayList<String>ss=new ArrayList<>();
        for(String a:c){
            if(!a.isEmpty()){
                ss.add(a);
            }
        }
        Collections.reverse(ss);
       return String.join(" ",ss);
    }
}