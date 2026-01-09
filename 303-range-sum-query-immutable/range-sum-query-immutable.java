class NumArray {
    int pp[];
    public NumArray(int[] nums) {
        pp=new int[nums.length];
        pp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pp[i]=pp[i-1]+nums[i];

        }
        // this.pp=nums;/
        
    }
    
    public int sumRange(int left, int right) {
        if(left==0)return pp[right];
        else{
            return pp[right]-pp[left-1];
        } 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */