class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> ss = new ArrayList<>();  // create first
        
        if (root == null) return ss;   // now it works
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> ll = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                ll.add(curr.val);
                
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            
            ss.add(0, ll);   // insert at beginning (bottom-up)
        }

        return ss;
    }
}