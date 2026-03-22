public class Codec {

    // Serialize
    public String serialize(TreeNode root) {
        if (root == null) return "";

        Queue<TreeNode> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        que.add(root);

        while (!que.isEmpty()) {
            TreeNode curr = que.poll();

            if (curr == null) {
                sb.append("null,");
            } else {
                sb.append(curr.val).append(",");
                que.add(curr.left);
                que.add(curr.right);
            }
        }

        return sb.toString();
    }

    // Deserialize
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;

        String[] arr = data.split(",");
        Queue<TreeNode> q = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);

        int i = 1;

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (!arr[i].equals("null"))
                q.add(curr.left = new TreeNode(Integer.parseInt(arr[i])));
            i++;

            if (!arr[i].equals("null"))
                q.add(curr.right = new TreeNode(Integer.parseInt(arr[i])));
            i++;
        }

        return root;
    }
}