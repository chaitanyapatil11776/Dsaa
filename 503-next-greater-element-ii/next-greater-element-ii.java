class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>ss=new Stack<>();
        int ans[]=new int[nums.length];
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
            while(!ss.isEmpty() && ss.peek()<=nums[i%n]){
                ss.pop();
            }
            if(i<n){
            if(ss.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=ss.peek();
            }
            }
            ss.push(nums[i%n]);
        
        
      
    }
      return ans;
}
}