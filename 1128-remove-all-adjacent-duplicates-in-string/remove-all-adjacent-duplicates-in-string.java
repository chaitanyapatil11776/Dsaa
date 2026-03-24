class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>ss=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!ss.isEmpty() && ss.peek()==c){
                ss.pop();
            }else{
                ss.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char z:ss){
            sb.append(z);
        }
        return sb.toString();
    }
}