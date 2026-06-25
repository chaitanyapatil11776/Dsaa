class Solution {
    public String reverseWords(String s) {
        String a[]=s.split("\\s+");
        ArrayList<String>ss=new ArrayList<>();
        for(String aa:a){
            if(!aa.isEmpty()){
                ss.add(aa);

            }
        }
        Collections.reverse(ss);
        return String.join(" ",ss);
    }
}