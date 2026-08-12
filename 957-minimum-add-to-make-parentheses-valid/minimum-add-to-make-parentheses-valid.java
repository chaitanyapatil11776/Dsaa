class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character>ss=new Stack<>();
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                
                ss.push(c);

                
            
        }else{
        if(ss.isEmpty()){
            count++;
        }else{
            ss.pop();
        }
        }
        }

        return count+ss.size();
    
}
}