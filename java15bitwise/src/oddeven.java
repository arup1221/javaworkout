public class oddeven {
    public static void main(String[] args) {
    int n = 34;
        System.out.println(isOdd(23));
    }
    static boolean isOdd(int n){
        return (n&1) == 1; //n*0001
    }
}