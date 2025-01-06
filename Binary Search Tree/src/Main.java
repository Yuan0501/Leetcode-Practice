// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.addNode(1);
        bst.addNode(2);


//        System.out.println("Level Order Traversal:");
//        bst.levelOrderTraversal();
//
//        System.out.println("In-Order Traversal (Tree Structure):");
//        bst.printInOrder();

     Problem501 slu = new Problem501();
     int[] res = slu.findMode(bst.root);
     for(int i : res){
         System.out.println(i);
     }

    }
}