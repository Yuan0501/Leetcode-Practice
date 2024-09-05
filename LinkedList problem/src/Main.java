// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addLast(1);
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(1);


        System.out.println(list1.toString(list1.head));


        Problem234 slu = new Problem234();
//        ListNode half = slu.getMid(list1.head);
//        System.out.println(list1.toString(half));
//
//        ListNode reverse = slu.reverse(half);
//
//
//
//        System.out.println("reverse:"+list1.toString(reverse));

        System.out.println(slu.isPalindrome(list1.head));




    }
}