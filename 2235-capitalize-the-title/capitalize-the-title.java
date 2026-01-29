class Solution {
    public String capitalizeTitle(String title) {
        String []ss=title.split("\\s+");
        for(int i=0;i<ss.length;i++){
            ss[i]=ss[i].toLowerCase();
            if(ss[i].length()>2){
                ss[i]=Character.toUpperCase(ss[i].charAt(0))+ss[i].substring(1);
            }
        }
    return String.join(" ",ss);

    }
}