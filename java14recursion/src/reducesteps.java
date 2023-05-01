//1342. Number of Steps to Reduce a Number to Zero

public class reducesteps {
    public static void main(String[] args) {
        System.out.println(numberofSteps(14));

    }
    public static int numberofSteps(int num){
        return helper(num,0);
    }
    static int helper(int num,int steps){
        if(num==0){   // Base conditon
            return steps;
        }
        if(num % 2 == 0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
