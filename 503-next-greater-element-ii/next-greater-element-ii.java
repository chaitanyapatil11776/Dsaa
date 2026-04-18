class Solution {
    public int[] nextGreaterElements(int[] nums) {
     Stack<Integer>ss=new   Stack<>();
     int a[]=new int[nums.length];
     int n=nums.length;
     for(int i=2*n-1;i>=0;i--){
        while(!ss.isEmpty() && ss.peek()<=nums[i%n]){
            ss.pop();
        }
        if(i<n){
            if(ss.isEmpty()){
                a[i]=-1;
            }else{
                a[i]=ss.peek();
            }
        }
        ss.push(nums[i%n]);


     }
     return a;
    }
}