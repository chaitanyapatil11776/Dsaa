class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer>ss=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;
        }
        for(int i=0;i<n*2;i++){
            int curr=i%n;
            while(!ss.isEmpty()  && nums[ss.peek()]<nums[curr] ){
                int index=ss.pop();
                ans[index]=nums[curr];
            }
            if(i<n){
                ss.push(curr);
            }
        }
        return ans;
    }
}