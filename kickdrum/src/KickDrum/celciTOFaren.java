package KickDrum;

import java.util.Scanner;

public class celciTOFaren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float cel = in.nextFloat();
        float faren = (cel * 9 / 5) + 32;
        System.out.println(faren);
    }
}
