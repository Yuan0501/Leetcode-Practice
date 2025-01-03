//Time complexity: O(nlogn)
//Space complexity: O(n)
public class Problem437 {
    public int pathSum(TreeNode root, int targetSum){
        if(root == null){
            return 0;
        }

        int res = 0;
        res = helper(root, targetSum);
        res += pathSum(root.left, targetSum);
        res += pathSum(root.right, targetSum);

        return res;
    }

    private int findSum(TreeNode node, int sum){
        if(node == null){
            return 0;
        }
        int res = 0;
        if(node.val == sum){
            res += 1;
        }
        res += findSum(node.left, sum - node.val);
        res += findSum(node.right, sum - node.val);

        return res;

    }

    private int helper(TreeNode node, int sum){
        if(node == null){
            return 0;
        }
        int res = 0;
        if(node.val == sum){
            res++;
        }
        int left = helper(node.left, sum - node.val);
        int right = helper(node.right, sum - node.val);
        return res + left + right;
    }
}
