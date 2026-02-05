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
    int sum=Integer.MIN_VALUE;
    int ss(TreeNode root){
        if(root==null)return 0;
        int left=Math.max(ss(root.left),0);
        int right=Math.max(ss(root.right),0);
    int max=root.val+left+right;
    sum=Math.max(sum,max);
    return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        ss(root);
        return sum;
        
    }
}