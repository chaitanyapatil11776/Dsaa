class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int a:nums){
            ss.put(a,ss.getOrDefault(a,0)+1);
        }
        for(int i:ss.keySet()){
            if(ss.get(i)>n/3){
                ans.add(i);
            }
        }
        return ans;
    }
}