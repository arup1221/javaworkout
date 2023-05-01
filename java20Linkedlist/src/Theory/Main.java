package Theory;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(34);
//        System.out.println(list);

    LL list = new LL();
    list.insertFirst(3);
    list.insertFirst(5);
    list.insertFirst(6);
    list.insertFirst(8);
    list.insertFirst(9);
    list.insertLast(98);
    list.insert(34,3);
    list.display();
//    System.out.println();
//    System.out.println(list.deleteFirst());
//    list.display();
//    System.out.println();
//    System.out.println(list.deleteLast());
//    list.display();
//    System.out.println();
//    System.out.println(list.delete(2));
//    list.display();
    }
}