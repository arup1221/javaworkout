package Theory;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        CircularQueue queue = new CircularQueue(5);
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(4);
        queue.insert(5);
        queue.insert(7);
        queue.insert(9);
        queue.insert(8);
        queue.insert(10);
        queue.insert(15);
        queue.insert(135);
        queue.insert(150);


       queue.display();

//        System.out.println(queue.remove());
//        queue.insert(122);
//        queue.display();
//
//        System.out.println(queue.remove());
////        queue.insert(122);
//        queue.display();

    }
}
