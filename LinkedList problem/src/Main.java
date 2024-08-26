// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(4);
        list.addLast(3);
        System.out.println(list.toString(list.head));

        LinkedList l2 = new LinkedList();
        l2.addLast(5);
        l2.addLast(6);
        l2.addLast(4);
        System.out.println(list.toString(l2.head));

//        list.addLast(4);
//        list.addLast(5);
//        String str = list.toString(list.head);
//        System.out.println(str);

        Problem2 slu = new Problem2();
        ListNode node = slu.addTwoNumbers(list.head,l2.head);
        System.out.println(list.toString(node));



    }
}