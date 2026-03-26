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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>ss=new ArrayList<>();
        if(root==null)return ss;
        Queue<TreeNode>que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            long sum=0;
        for(int i=0;i<size;i++){
                TreeNode curr=que.poll();
                sum+=curr.val;
            if(curr.left!=null)que.add(curr.left);
            if(curr.right!=null)que.add(curr.right);
            }
            ss.add((double)sum/size);
        }
        return ss;
    }
}