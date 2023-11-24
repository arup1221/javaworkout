package Theory;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(34);
//        System.out.println(list);
//
//    LL list = new LL();
//    list.insertFirst(3);
//    list.insertFirst(3);
//    list.insertFirst(6);
//    list.insertFirst(8);
////        list.insertFirst(9);
//    list.insertFirst(9);
////    list.insertLast(9);
//    list.display();
//    System.out.println();
//    list.duplicate();
//    list.display();
//    list.insert(34,3);
//    list.display();
//    System.out.println();
//    list.insertRec(88,2);
//    list.display();
//    System.out.println();
//    System.out.println(list.deleteFirst());
//    list.display();
//    System.out.println();
//    System.out.println(list.deleteLast());
//    list.display();
//    System.out.println();
//    System.out.println(list.delete(2));
//    list.display();
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.marge(first, second);
        ans.display();
        System.out.println();

        LL list = new LL();
        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
        list.display();
        System.out.println();
        list.bubbleSort();
        list.display();
        System.out.println();
    }
}