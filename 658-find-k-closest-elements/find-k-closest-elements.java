class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low=0;
        int hight=arr.length-k;
        while(low<hight){
            int mid=low+(hight-low)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                low=mid+1;
            }else{
                hight=mid;
            }
        }
        List<Integer>ss=new ArrayList<>();
        for(int i=0;i<k;i++){
            ss.add(arr[low+i]);
        }
        return ss;
    }
}