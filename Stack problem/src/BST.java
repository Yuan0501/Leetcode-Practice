import java.util.*;

public class BST {
    TreeNode root;
    int size;
    public BST(){
        root = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int a){
        root = add(root,a);
    }

    private TreeNode add(TreeNode node, int a){
        if(node == null){
            size++;
            return new TreeNode(a);
        }

        if(a < node.val){
            node.left = add(node.left, a);
        }else if(a > node.val){
            node.right = add(node.right,a);
        }

        return node;
    }

    public TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return null;
        }

        if(key > root.val){
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }else{
            if(root.left == null && root.right == null)
                root = null;
            else if (root.right != null) {
                int val = successor(root);
                root.val = val;
                root.right = deleteNode(root.right, val);
            }else {
                int val = precessor(root);
                root.val = val;
                root.left = deleteNode(root.left, val);
            }
        }

        return root;
    }

    private int successor(TreeNode root){
        root = root.right;
        while (root.left != null){
            root = root.left;
        }
        return root.val;
    }

    private int precessor(TreeNode root){
        root = root.left;
        while (root.right != null){
            root = root.right;
        }
        return root.val;
    }

// Using recursion to traverse
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

//    Using stack to traverse
    public void preOderIter(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode top = stack.pop();
            System.out.println(top.val);

            if(top.right != null){
                stack.push(top.right);
            }

            if (top.left != null) {
                stack.push(top.left);
            }
        }
    }
// Using Queue to level traverse
//    public List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> result = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        if(root == null){
//            return result;
//        }
//        queue.add(root);
//        int level = 0;
//        while(!queue.isEmpty()){
//            result.add(new ArrayList<>());
//            int level_num = queue.size();
//            for(int i = 0; i < level_num; i++){
//                TreeNode node = queue.remove();
//                result.get(level).add(node.val);
//
//                if(node.left != null){
//                    queue.add(node.left);
//                }
//                if(node.right != null){
//                    queue.add(node.right);
//                }
//            }
//            level++;
//        }
//        return result;
//
//    }




}
