class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;


    
        int hight=arr.length-1;
        while(low<hight){
        int mid=low+(hight-low)/2;
        if(arr[mid]>arr[mid+1]){
            hight=mid;
        }else{
            low=mid+1;
        }
        }
        return low;
    }
}