class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>ss=new Stack<>();
        ss.push(0);
        for(char c:s.toCharArray()){
            if(c=='('){
                ss.push(0);
            }else{
                int val=ss.pop();
                int score=Math.max(2*val,1);
                ss.push(ss.pop()+score);
            }
        }
        return ss.pop();
    }
}