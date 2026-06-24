class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            int digit=String.valueOf(i).length();
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}