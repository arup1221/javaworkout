public class Seives {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        seives(n,primes);
        //System.out.println(primes[0]);

    }
    //false in array means number is prime
    static void seives(int n, boolean[] prime){
        for (int i = 2; i*i <= n ; i++) {
            if(!prime[i]){
                for (int j = i*2  ; j <=n ; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
        if(!prime[i]){
            System.out.print(i + " ");
        }
        }
    }
}
