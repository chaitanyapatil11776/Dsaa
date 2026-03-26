/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>que=new LinkedList<>();
        que.add(root);
        int level=0;
        int maxlevel=0;
        Long maxsum=Long.MIN_VALUE;
        while(!que.isEmpty()){
            // TreeNode curr=que.poll();
             long sum=0;
            level++;
            int size=que.size();
            while(size-->0){
                  TreeNode curr=que.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    que.add(curr.left);
                }if(curr.right!=null){
                    que.add(curr.right);
                }
            }
                if(sum>maxsum){
                    maxsum=sum;
                    maxlevel=level;

                }
            }
        
        return maxlevel;
    }
}