package code.java;

public class prittyprinting {
    public static void main(String[] args) {
        float a = 3443.534343f;
        System.out.printf("Formatted numbere is %.2f", a);
        //it print 2 decimal after the point
        System.out.println();
        System.out.printf("pie: %.3f",Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I am %s","Arup","cool");
        System.out.println();
        System.out.println("There are many format specifiers we can use. Here are some common ones:\n" +
                "\n" +
                "%c - Character\n" +
                "%d - Decimal number (base 10)\n" +
                "%e - Exponential floating-point number\n" +
                "%f - Floating-point number\n" +
                "%i - Integer (base 10)\n" +
                "%o - Octal number (base 8)\n" +
                "%s - String\n" +
                "%u - Unsigned decimal (integer) number\n" +
                "%x - Hexadecimal number (base 16)\n" +
                "%t - Date/time\n" +
                "%n - Newline\n");
    }
}
