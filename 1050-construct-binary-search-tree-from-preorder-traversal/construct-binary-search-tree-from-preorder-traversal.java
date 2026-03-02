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
    public TreeNode bstFromPreorder(int[] preorder) {

 return ss(preorder,Integer.MAX_VALUE,new int[]{0});       
    }
    TreeNode ss(int A[],int bound,int i[]){
        if(i[0]==A.length ||  A[i[0]]>bound)return null;
        TreeNode root=new TreeNode(A[i[0]++]);
        root.left=ss(A,root.val,i);
        root.right=ss(A,bound,i);
        return root;
    }
}