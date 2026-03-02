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
    void helper(TreeNode root,int num){
        if(root==null)return  ;
        num=num*10+root.val;
        if(root.left==null && root.right==null){
            sum=sum+num;
            return;
        }
        helper(root.left,num);
        helper(root.right,num);

    }
    

    public int sumNumbers(TreeNode root) {
sum=0;
    if(root==null)return 0 ;
    helper(root,0);
    return sum;
        
    }
}