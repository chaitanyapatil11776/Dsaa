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
    void ss(TreeNode root,ArrayList<Integer>re){
        if(root==null)return;
        ss(root.left,re);
        re.add(root.val);
        ss(root.right,re);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>ss=new ArrayList<>();
        ss(root,ss);
        return ss;
    }
}