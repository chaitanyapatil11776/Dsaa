class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>s1=new HashSet<>();
        HashSet<Integer>s2=new HashSet<>();
        for(int a:nums1){
            s1.add(a);
        }
        for(int b:nums2){
            if(s1.contains(b)){
                s2.add(b);
            }
        }
        int a[]=new int[s2.size()];
        int i=0;
        for(int aa:s2){
            a[i++]=aa;
        }
        return a;
    }
}