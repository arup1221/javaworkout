public class poweroftwo {
    public static void main(String[] args) {
        int n = 32; // fix for n = 0
        boolean ans = false;
        if (n != 0) {
            ans = (n & (n-1)) == 0;
        }
      
        System.out.println(ans);
    }
}
