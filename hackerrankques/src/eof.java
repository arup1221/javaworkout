import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
public class eof {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        while(true){
            String a = in.nextLine();
            System.out.println(i + " " + a);
            i++;
        }
    }
}

   /* The hasNext() method checks if the Scanner has another token in its input.
        A Scanner breaks its input into tokens using a delimiter pattern,
        which matches whitespace by default. That is, hasNext() checks the input
        and returns true if it has another non-whitespace character.

    */