class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        ArrayList<Integer>right=new ArrayList<>();
        ArrayList<Integer>left=new ArrayList<>();

        Stack<Integer>ss=new Stack<>();
        for(int a:heights){
            right.add(n);
        }

        for(int i=0;i<n;i++){
            while(!ss.isEmpty()  && heights[ss.peek()]>heights[i]){
                int index=ss.pop();
                right.set(index,i);
            }
            ss.push(i);
        }
        ss.clear();

        for(int a:heights){
            left.add(-1);
        }
        for(int i=0;i<n;i++){
            while(!ss.isEmpty()  && heights[ss.peek()]>=heights[i]){
                ss.pop();

            }
            if(!ss.isEmpty()){
                left.set(i,ss.peek());
            }
            ss.push(i);
        }

int max=0;
for(int i=0;i<n;i++){
    int width=right.get(i)-left.get(i)-1;
    int area=width*heights[i];
    max=Math.max(max,area);
}
 return max;
    }

}