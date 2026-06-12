class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer>h1=new HashSet<>();
        HashSet<Integer>h2=new HashSet<>();
        for(int i:nums1){
            h1.add(i);
        }
           for(int i:nums2){
            h2.add(i);
           }

int ans1=0;
int ans2=0;
for(int a:nums1){
    if(h2.contains(a)){
        ans1++;
    }
}

 for(int aa:nums2){
    if(h1.contains(aa)){
        ans2++;
    }

 }

 return new int[]{ans1,ans2};


    }
}