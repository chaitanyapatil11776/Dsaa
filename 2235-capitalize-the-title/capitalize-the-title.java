class Solution {
    public String capitalizeTitle(String title) {
        String word[]=title.split("\\s+");
        ArrayList<String>ss=new ArrayList<>();
        for(String aa:word){

            aa=aa.toLowerCase();
            if(aa.length()>2){
                aa=Character.toUpperCase(aa.charAt(0))+aa.substring(1);
            }
            ss.add(aa);
        }
        return String.join(" ",ss);
    }
}