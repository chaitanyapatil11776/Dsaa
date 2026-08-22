class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>ss=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray()){
            if(!ss.isEmpty() && ss.peek()==c){
                ss.pop();
            }else{
                ss.push(c);
            }
        }
        for(char pp:ss){
            sb.append(pp);
        }
        return sb.toString();
    }
}