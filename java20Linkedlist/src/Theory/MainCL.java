package Theory;

public class MainCL {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(12);
        list.insert(13);
        list.insert(15);
        list.insert(17);
        list.display();
        list.delete(13);
        list.display();
    }
}
