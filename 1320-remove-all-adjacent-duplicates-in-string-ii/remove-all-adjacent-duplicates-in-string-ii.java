class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Character>ss=new Stack<>();
        Stack<Integer>cnt=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!ss.isEmpty() && ss.peek()==c){
                int count=cnt.pop()+1;
                if(count==k){
                    ss.pop();
                }else{
                    cnt.push(count);
                }
            
            }
            else{
                ss.push(c);
                cnt.push(1);
            }
        }
        StringBuilder sb=new StringBuilder();
      while(!ss.isEmpty()){
        char c=ss.pop();
        int count=cnt.pop();
        for(int i=0;i<count;i++){
            sb.append(c);
        }
      }
      return sb.reverse().toString();
    }
}