class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        int hight=m*n-1;
        while(low<=hight){
            int mid=low+(hight-low)/2;
            int row=mid/n;
            int col=mid%n;
            int ss=matrix[row][col];
            if(ss==target){
                return true;
            }else if(ss<target){
                low=mid+1;
            }else{
                hight=mid-1;
            }
        }
        return false;
    }
}