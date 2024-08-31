// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addLast(4);
        list1.addLast(2);
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(9);
        list1.addLast(7);
        list1.addLast(5);



        System.out.println(list1.toString(list1.head));


        Problem148 slu = new Problem148();
        ListNode node = slu.sortList(list1.head);
        System.out.println(list1.toString(node));



    }
}