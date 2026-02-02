class Solution {
    public String reverseWords(String s) {
        String ar[]=s.trim().split("\\s+");
        ArrayList<String>ss=new ArrayList<>();
        for(String p:ar){
            StringBuilder sb=new StringBuilder(p);
            ss.add(sb.reverse().toString());
        }
        return String.join(" ",ss);
    }
}