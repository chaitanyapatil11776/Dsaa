class Solution {
    public String largestEven(String s) {
        int last =s.lastIndexOf('2');
        if(last==-1){
            return "";
        }
        return s.substring(0,last+1);
    }
}