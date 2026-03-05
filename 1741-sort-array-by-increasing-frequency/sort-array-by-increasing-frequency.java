class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int a:nums){
            ss.put(a,ss.getOrDefault(a,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int a:nums){
            list.add(a);
        }
        Collections.sort(list,(a,b)->{
            if(ss.get(a)==ss.get(b)){
                return b-a;
            }
            return ss.get(a)-ss.get(b);
        });
        
        int aa[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            aa[i]=list.get(i);
        }
        return aa;
    }
}