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
    int sum=0;
    int max=0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root,0);
        return sum;
    }
    void dfs(TreeNode root, int depth){
        if(root==null)return ;
        if(depth>max){
            max=depth;
            sum=root.val;

        }else if(max==depth){
            sum+=root.val;
        }
dfs(root.left,depth+1);
dfs(root.right,depth+1);
        
    }
}