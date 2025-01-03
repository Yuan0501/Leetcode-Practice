public class Problem671 {
    int min = Integer.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        int parent = root.val;
        dfs(root, parent);
        if(min == parent){
            return -1;
        }
        return min < Integer.MAX_VALUE? min : -1;
    }

    public void dfs(TreeNode root, int parent){
        int secNum = 0;
        if(root != null){
            if(root.val == parent){
                dfs(root.left, parent);
                dfs(root.right, parent);
            } else if (root.val < min && root.val > parent) {
                min = root.val;
            }
        }

    }
}
