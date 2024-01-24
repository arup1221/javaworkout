import java.util.ArrayList;

public class sumarray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(17);
        arr.add(8);
        arr.add(12);
        
        System.out.println(sum(arr));
    }
    static int sum(ArrayList<Integer> arr){
        int sum = 0;
        // for(int num: arr){
        //     sum = sum + num;
        // }
        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
        }
        return sum;
    }
}
