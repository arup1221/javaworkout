public class reverse {
    public static void main(String[] args) {
        // int[] arr = {2,5,6,3,4,8};
        // revArray(arr);
        // System.out.println("Reversed array");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i] + " ");
        // }\

        String s = "Hello World";
        System.out.println(revString(s));

    }

    static void revArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static String revString(String s) {
        char[] charArr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
        return new String(charArr);
    }
}
