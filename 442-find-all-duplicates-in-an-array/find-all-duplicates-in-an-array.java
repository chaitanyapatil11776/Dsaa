class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>ss=new HashSet<>();
        ArrayList<Integer>aa=new ArrayList<>();
        for(int a:nums){
            if(!ss.add(a)){
                aa.add(a);
            }

        }
        return aa;
    }
}