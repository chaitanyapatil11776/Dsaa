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
        List<Integer>ss=new ArrayList<>();
        sss(root,ss);
        return ss;
    }
void sss(TreeNode root,List<Integer>ss){
    if(root==null)return ;
    ss.add(root.val);

    sss(root.left,ss);
    sss(root.right,ss);

}

    
}