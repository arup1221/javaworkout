package AVLtree;

public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();

        for (int i = 0; i < 7; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
    }
}
