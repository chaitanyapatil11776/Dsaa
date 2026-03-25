class Solution {
    
    int max = 0;
    
    public int longestZigZag(TreeNode root) {
        dfs(root, true, 0);   // start going left
        dfs(root, false, 0);  // start going right
        return max;
    }
    
    void dfs(TreeNode node, boolean goLeft, int length){
        if(node == null) return;
        
        max = Math.max(max, length);
        
        if(goLeft){
            // go left, then next must go right
            dfs(node.left, false, length + 1);
            
            // restart from right child
            dfs(node.right, true, 1);
        } else {
            // go right, then next must go left
            dfs(node.right, true, length + 1);
            
            // restart from left child
            dfs(node.left, false, 1);
        }
    }
}