import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        LinkedList<TreeNode> nodeList = new LinkedList<>();
        nodeList.addLast(root);
        nodeList.addLast(null);

        LinkedList<Integer> levelList = new LinkedList<>();
        boolean leftToRight = true;
        while(!nodeList.isEmpty()){
            TreeNode node = nodeList.removeFirst();
            if(node != null){
                if(leftToRight){
                    levelList.addLast(node.val);
                }else{
                    levelList.addFirst(node.val);
                }

                if(node.left != null){
                    nodeList.addLast(node.left);
                }
                if(node.right != null){
                    nodeList.addLast(node.right);
                }
            }else{
                result.add(levelList);
                levelList = new LinkedList<>();
                leftToRight = !leftToRight;
                if(nodeList.size() > 0){
                    nodeList.addLast(null);
                }
            }
        }

        return result;


    }
}
