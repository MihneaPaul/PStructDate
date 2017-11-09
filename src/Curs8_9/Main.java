package Curs8_9;

/**
 * Created by Mihnea on 09.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList lst = new MyLinkedList();
        lst.add(7,0);
        lst.add(8,1);
        lst.addEnd(9);
        System.out.println(lst);
        lst.add(777,1);
        System.out.println(lst);
        System.out.println(lst.searchFor(8));
        lst.addBegin(999);
        System.out.println(lst);
        lst.delete(1);
        System.out.println(lst);
        lst.deleteBegin();
        System.out.println(lst);
        lst.deleteEnd();
        System.out.println(lst);
    }
}
