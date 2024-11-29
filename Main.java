import java.sql.SQLOutput;

class Main {

    static ListNode imaAddLast(ListNode next, int value) {
        if (next == null) {
            return new ListNode(value, null);
        }
        return new ListNode(next.value, imaAddLast(next.next, value));
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(2));
        for (int i = 0; i < 24; i++) {
            System.out.println(fibonacci(i) + ",");
        }
        System.out.println(isZahlFibonacci(28657));

        // System.out.println(anzahlMoeglichkeiten(7));
        //addLast(imaAddLast(, 3));
    }

    static boolean isZahlFibonacci(int n) {
        for (int i = 0; i < 100; i++) {
            if (fibonacci(i) == n) {
                return true;
            }
        }
        return false;
    }


    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //   public record TreeNode{
    //      static TreeNode left;
    //static TreeNode right;
    //static int value;
    //}
    // static int sum(TreeNode node){
    //       return node.value()+sum(node.left())+sum(node.right());
    //}
    // int summe = sum(rootNode);
    static int anzahlMoeglichkeiten(int stufe) {
        if (stufe < 1) {
            throw new IllegalArgumentException();
        }
        if (stufe == 1 || stufe == 2) {
            return 1;
        }
        return anzahlMoeglichkeiten(stufe - 1) + anzahlMoeglichkeiten(stufe - 2);

    }

    static SinglyLinkedList addFirst(final SinglyLinkedList list, final int value) {
        ListNode first = new ListNode(value, list.root);
        return new SinglyLinkedList(first);
    }

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    static String toString(final SinglyLinkedList list) {
        if (list == null || list.root == null) {
            return "";
        }
        return stringToString(list.root);

    }

    static String stringToString(ListNode test) {
        if (test == null) {
            return "";
        }
        return test.value + " ," + stringToString(test.next);

    }

    ;

    public record ListNode(int value, ListNode next) {//rekursive Datenstruktur)

    }

    public record SinglyLinkedList(ListNode root) {

    }
    //  static SinglyLinkedList addLast(final SinglyLinkedList list,final int value){
    // imaAddLast(list.root);{

    //    }


}


