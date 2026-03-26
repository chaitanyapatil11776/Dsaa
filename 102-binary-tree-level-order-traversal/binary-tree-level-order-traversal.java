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
if(root==null)return ss;
Queue<TreeNode>que=new LinkedList<>();
que.add(root);
while(!que.isEmpty()){
    int size=que.size();
    ArrayList<Integer>level=new ArrayList<>();
    while(size-->0){
        TreeNode curr=que.poll();
        level.add(curr.val);
        
            if(curr.left!=null){
                que.add(curr.left);
            }
            if(curr.right!=null){
                que.add(curr.right);
            }
        }
    
    ss.add(level);
}
return  ss;
    }
}