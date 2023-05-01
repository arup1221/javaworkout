import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //int X = in.nextInt();
        int T = in.nextInt();
        for (int i = 0; i <= T; i++) {
            int x , y;
            x = in.nextInt();
            y = x + 3;
            if(y<=10)
                System.out.println("Yes");
            else{
                System.out.println("No");
        }

        }



    }
}