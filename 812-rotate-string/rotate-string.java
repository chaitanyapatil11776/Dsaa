class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        String sc=s+s;
        return sc.contains(goal);
    }
}