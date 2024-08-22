// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        String str = list.toString(list.head);
        System.out.println(str);

        Problem206 slu = new Problem206();
        ListNode node = slu.reverseList(list.head);
        System.out.println(list.toString(node));

    }
}