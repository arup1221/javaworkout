import java.util.ArrayList;

public class reversearr {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(3);
        arr.add(8);
        arr.add(6);
        arr.add(4);

        System.out.println(reverse(arr));

    }
    static  ArrayList<Integer> reverse(ArrayList<Integer> arr){
        ArrayList<Integer> reverselist = new ArrayList<>();
        for(int i = arr.size() -1; i>=0; i-- )
        {
            reverselist.add(arr.get(i));
        }
        return reverselist;
    }
}
