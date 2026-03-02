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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>ss=new  ArrayList<>();
        helper(root,ss);
        return ss;
    }

    void helper(TreeNode root,List<Integer>re){
        if(root==null)return;
        re.add(root.val);
        helper(root.left,re);
        helper(root.right,re);
    }
}