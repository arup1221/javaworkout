package code.java;

public class performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i); //computer takes 'a' s ashy value ans add 1 every time
      //But we convert it into char
           // System.out.println(ch+ " ");
            series = series + ch;
            System.out.println(series);
        }
        System.out.println(series);
    }
}
