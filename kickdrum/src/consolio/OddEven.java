package consolio;

public class OddEven {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    int oddSum =0;
    int evenSum=0;

    for(int i=0; i<arr.length; i++){
        if(i%2 ==0){
            evenSum += arr[i];

        }else{
            oddSum += arr[i];
        }
    }
        System.out.println("evenSum "+ evenSum);
        System.out.println("oddSum "+ oddSum);
    }
}
