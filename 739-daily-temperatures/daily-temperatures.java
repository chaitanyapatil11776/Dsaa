class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];
        Stack<Integer>ss=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!ss.isEmpty() && temperatures[ss.peek()]<temperatures[i]){
                int prv=ss.pop();
                ans[prv]=i-prv;
            }
            ss.push(i);


        }
        return ans;
    }
}