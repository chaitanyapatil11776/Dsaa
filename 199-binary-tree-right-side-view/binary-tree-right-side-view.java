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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>ss=new ArrayList<>();
        ss(root,0,ss);
        return ss;
    }
    void ss(TreeNode root,int level,ArrayList<Integer>ans){
        if(root==null)return;
        if(level==ans.size()){
            ans.add(root.val);
        }
        ss(root.right,level+1,ans);
        ss(root.left,level+1,ans);
        
    }
}