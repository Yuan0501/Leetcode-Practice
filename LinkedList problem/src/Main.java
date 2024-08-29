// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);

        LinkedList list2 = new LinkedList();
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);

        System.out.println(list1.toString(list1.head));
        System.out.println(list2.toString(list2.head));


        Problem21 slu = new Problem21();
        ListNode node = slu.mergeTwoLists(list1.head, list2.head);
        System.out.println(list1.toString(node));



    }
}