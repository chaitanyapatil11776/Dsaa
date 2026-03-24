
class Solution {
    public String makeGood(String s) {
        Stack<Character>ss=new Stack<>();
        for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(!ss.isEmpty() && Math.abs(ss.peek()-c)==32){
            ss.pop();
        }
        else{
            ss.push(c);
        }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:ss){
            sb.append(c);
        }
        return sb.toString();
    }
}