class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>ss=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='(' || c!=')'){
                ss.push(c);
            }else{
            ArrayList<Character>ll=new ArrayList<>();
            while(!ss.isEmpty()   &&   ss.peek()!='(' ){
                ll.add(ss.pop());
            }

            ss.pop();
            for(char pp:ll){
                ss.push(pp);
            }
            }
        }

        while(!ss.isEmpty()){
            sb.insert(0,ss.pop());
        }

        return sb.toString();
    }
}