class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>ss=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(ss.size()>0){
                    sb.append(c);
                }ss.push(c);
            }else{
                ss.pop();
                if(ss.size()>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}