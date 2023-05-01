public class nozeros {
    public static void main(String[] args) {
        System.out.println(func(1020,0));
    }
    static int func(int n,int count){
        if(n==0){  // Base condition
            return count;
        }
        int digits = n %10 ;
        if(digits==0){
           return func(n/10,count+1);
        }
        else{
           return func(n/10,count);
        }

    }
}
