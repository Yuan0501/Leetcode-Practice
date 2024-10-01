public class Problem236 {
    private TreeNode ans;
    public Problem236(){
        this.ans = null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        recurseTree(root, p, q);
        return this.ans;
    }

    private boolean recurseTree(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return false;
        }

        int left = 0, right = 0, mid = 0;
        if(recurseTree(root.left, p, q)){
            left = 1;
        }

        if(recurseTree(root.right, p, q)){
            right = 1;
        }
        if(root == p || root == q){
            mid = 1;
        }

        if((left + right + mid) >= 2){
            this.ans = root;
        }

        return (left + right + mid) > 0;
    }
}
