class Solution {
    public String simplifyPath(String path) {
        String[]arr=path.split("/");
        Stack<String>ss=new Stack<>();
        for(String a:arr){
            if(a.equals("..")  && !ss.isEmpty()){
                ss.pop();
            }
            else if(!a.equals("")  && !a.equals(".")   && !a.equals("..")){
                ss.push(a);
            }
        }

        StringBuilder sb=new StringBuilder();
        for(String a:ss){
            sb.append("/");
            sb.append(a);
        }
        return sb.length()==0  ? "/":sb.toString();
    
    }
}