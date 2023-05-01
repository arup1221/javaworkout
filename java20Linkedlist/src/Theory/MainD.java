package Theory;

public class MainD {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertLast(34);
        list.insert(34,67);
        list.display();
    }
}
