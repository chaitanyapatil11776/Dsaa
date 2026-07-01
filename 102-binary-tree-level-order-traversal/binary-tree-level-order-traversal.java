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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ss=new ArrayList<>();
        Queue<TreeNode>qu=new LinkedList<>();
          if (root == null) {
            return ss;
        }
        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            ArrayList<Integer>level=new ArrayList<>();
            while(size-->0){
                TreeNode curr=qu.poll();
                level.add(curr.val);
                if(curr.left!=null){
                    qu.add(curr.left);
                }if(curr.right!=null){
                    qu.add(curr.right);
                }
            }
            ss.add(level);
        }
        return ss;
    }
}