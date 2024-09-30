package consolio;

public class ReverseString {
    // Function to reverse the string
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
//        sb.append(input);
        sb.reverse();
        return sb.toString();

    }

    // Main function
    public static void main(String[] args) {
        String str = "Hello World!";
        String result = reverse(str);
        System.out.println("Reversed string: " + result);
    }
}
