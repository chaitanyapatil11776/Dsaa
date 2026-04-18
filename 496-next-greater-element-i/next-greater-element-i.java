class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>ss=new Stack<>();
        HashMap<Integer,Integer>pp=new HashMap<>();
        for(int a:nums2){
            while(!ss.isEmpty() && ss.peek()<a){
                pp.put(ss.pop(),a);
            }
            ss.push(a);
        }
        int aa[]=new int[nums1.length];
    for(int i=0;i<nums1.length;i++){
        aa[i]=pp.getOrDefault(nums1[i],-1);
    }
    return aa;

    }
}