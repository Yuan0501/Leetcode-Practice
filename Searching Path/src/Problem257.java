import java.util.ArrayList;
import java.util.List;

public class Problem257 {

    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root){
        dfs(root, "");
        return res;
    }



    public void dfs(TreeNode root, String str){
      if(root != null){
          if(root.left == null && root.right == null){
              str = str + Integer.toString(root.val);
              res.add(str);
          }else {
              str = str + Integer.toString(root.val);
              str = str + "->";
              dfs(root.left, str);
              dfs(root.right, str);
          }
      }
    }
}
