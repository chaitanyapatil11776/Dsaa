class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []>re=new ArrayList<>();
        int i=0;
        int n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            re.add(intervals[i]);
            i++;
        }
    while(i<n && intervals[i][0]<=newInterval[1]){
        newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
        newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
        i++;
    }re.add(newInterval);
    while(i<n){
        re.add(intervals[i]);
        i++;
    }
    return re.toArray(new int[re.size()][]);
    }}