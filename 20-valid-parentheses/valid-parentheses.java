class Solution {
    public boolean isValid(String s) {
        Stack<Character>ss=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('  ||c=='[' || c=='{'){
                ss.push(c);
            }
            else{
                if(ss.isEmpty())return false;

                char top=ss.pop();
                if((c==']'  && top!='[')  || (c==')' && top!='(')||(c=='}' && top!='{'))return false;
            }
        }

        return ss.isEmpty();
    }
}