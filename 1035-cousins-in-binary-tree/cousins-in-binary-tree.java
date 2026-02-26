class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            
            int size = q.size();
            boolean foundX = false;
            boolean foundY = false;
            
            for (int i = 0; i < size; i++) {
                
                TreeNode curr = q.poll();
                
                if (curr.val == x) foundX = true;
                if (curr.val == y) foundY = true;
                
                // Check siblings
                if (curr.left != null && curr.right != null) {
                    if ((curr.left.val == x && curr.right.val == y) ||
                        (curr.left.val == y && curr.right.val == x)) {
                        return false;  // same parent
                    }
                }
                
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            
            if (foundX && foundY) return true;
            if (foundX || foundY) return false;
        }
        
        return false;
    }
}