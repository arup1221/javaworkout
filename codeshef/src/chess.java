import java.util.Scanner;

public class chess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int i = 0; i <T; i++) {
            int x1, y1,x2,y2;
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();

            if (x1==x2 && x1<=8 && x2<= 8)
                System.out.println("Yes");
            else if(y1==y2 && y1<=8 && y2<= 8){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
