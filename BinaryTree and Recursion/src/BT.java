import java.util.LinkedList;
import java.util.Queue;

public class BT {
    TreeNode root;
    int size ;

    public BT(){
        root = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void addNode(TreeNode node){
        if(root == null){
            root = node;
        }else{
            add(root, node);
        }
    }

    private void add(TreeNode root, TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while(true){
            TreeNode top = queue.poll();
            if(top.left != null){
                queue.add(top.left);
            }else{
                top.left = node;
//                flag = true;
                break;
            }

            if(top.right != null){
                queue.add(top.right);
            }else{
                top.right = node;
//                flag = true;
                break;
            }
        }
    }

    public void levelTraversal(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node == null){
                System.out.println("null");
            }else {
                System.out.print(node.val + " ");
            }
            if(node.left != null){
                queue.add(node.left);
            }

            if(node.right != null){
                queue.add(node.right);
            }
        }

    }

}
