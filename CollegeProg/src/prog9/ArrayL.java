package prog9;
import java.util.*;
public class ArrayL {
    ArrayList<String> list = new ArrayList<String>();
    public void arraydisplay(){
        list.add("CSE");
        list.add("ISE");
        list.add("ME");
        System.out.println("Arraylist elements are: ");
        System.out.println(list);
        System.out.println(" ");
    }
    public void appendatend(){
        System.out.println("Enter the elements to applied at end ");
        Scanner in = new Scanner(System.in);
        String ele = in.next();
        list.add(ele);
        System.out.println(list);
        System.out.println(" ");

    }
    public void inseratpos(){
        System.out.println("Enter the position and element to insert: ");
        Scanner in = new Scanner(System.in);
        int pos = in.nextInt();
        String ele = in.next();
        list.add(pos,ele);
        System.out.println(list);
        System.out.println(" ");
    }
    public void Searchele(){
        System.out.println("Enter the element to search ");
        Scanner in = new Scanner(System.in);
        String elem = in.next();
        int elin = list.indexOf(elem);
        if(elin==-1){
            System.out.println("The element not found");
        }
        else {
            System.out.println("Element found at "+ elin);
        }
    }
    public void print(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the starting character to print strings");
        char inputC = in.next().charAt(0);
        String strc = Character.toString(inputC);
        System.out.println("String starting with Character: "+ strc);
        for (int i = 0; i < list.size(); i++) {
        if(list.get(i).startsWith(strc))    {
            System.out.println(list.get(i));
        }
        }
    }

    public static void main(String[] args) {
        ArrayL obj = new ArrayL();
        obj.arraydisplay();
        obj.appendatend();
        obj.inseratpos();
        obj.Searchele();
        obj.print();
}
}
