class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>ss=new Stack<>();
        boolean remove=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!ss.isEmpty() && ss.peek()==c){
                ss.pop();
                remove=true;
            }else{
                ss.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char z:ss){
            sb.append(z);
        }
        if(!remove)return sb.toString();
        return removeDuplicates(sb.toString());
    }
}