package Questions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,1,5,6,2,3};
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//           arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(largestRectangleArea(arr));

    }

    public static int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
         int max = 0;

         stack.push(0); //Initial value

        for (int i = 1; i < heights.length ; i++) {
            while(!stack.isEmpty() && heights[i]< heights[stack.peek()]){ // increasing order items
                max = getMax(heights,stack,max,i);
            }
            stack.push(i);
        }

        int h = heights.length;
        while (!stack.isEmpty()){
            max = getMax(heights,stack,max,h);
        }

        return max;
    }
    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i){
        int area;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area = arr[popped] * i;
        }
        else{
            area = arr[popped] * (i -1 -stack.peek());
        }
        return Math.max(max,area);
    }
}
