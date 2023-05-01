public class newtonsqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    //it gives most accurate value of square root of x by Newton Rapson method
    static double sqrt(double n ){
        double x = n; // initially value of x is n
        double root ;
        while(true){
             root = 0.5 * (x + (n/x));
            if(Math.abs(root - x)< 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
