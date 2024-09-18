import java.util.ArrayList;
import java.util.List;
//Time complexity: O(nlogn)
//Space complexity: O(logn)
public class Problem257 {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        if(root.left == null && root.right == null){
            res.add(String.valueOf(root.val));
            return res;
        }
// Copy operation occurs in each node, for each node copy current path to store, so the time complexity is 0(nlogn)
        if(root.left != null){
            List<String> lst = binaryTreePaths(root.left);
            for (String s : lst){
                StringBuilder str = new StringBuilder();
                str.append(root.val);
                str.append("->");
                str.append(s);
                res.add(str.toString());
            }

        }

        if(root.right != null){
            List<String> lst = binaryTreePaths(root.right);
            for (String s : lst){
                StringBuilder str = new StringBuilder();
                str.append(root.val);
                str.append("->");
                str.append(s);
                res.add(str.toString());
            }
        }

        return res;
    }
}
