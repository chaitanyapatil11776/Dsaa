class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character>ss=new Stack<>();
        StringBuilder sb=new StringBuilder ();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(ss.size()>0){
                  
                    sb.append(c);
                }
                ss.push(c);
            }

                else{
                    ss.pop();
                    if(ss.size()>0){
                        sb.append(c);

                    }
                }
            }
        

        return sb.toString();
        


    }
}