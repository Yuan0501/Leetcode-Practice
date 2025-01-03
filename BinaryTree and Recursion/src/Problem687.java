public class Problem687 {
    int max = 0;
    public int longestUnivaluePath(TreeNode root){
        if(root == null){
            return 0;
        }
       dfs(root);

        return max;
    }

    public int helper(TreeNode root, int parent){
        if(root == null){
            return 0;
        }
        int left = helper(root.left, root.val);
        int right = helper(root.right, root.val);
        max = Math.max(max, left + right);

        if(root.val == parent){
            return 1 + Math.max(left, right);
        }else {
            return 0;
        }
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(root.left != null && root.val == root.left.val){
            left += 1;
        }
        if(root.right != null && root.val == root.right.val){
            right += 1;
        }
        max = Math.max(max, left + right);
        return Math.max(left, right);
    }
}
