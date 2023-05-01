package partB.Stack;

import java.util.Scanner;

class Start {
    int top = -1;

    void push(int ele, int[] arr, int n) {
        if (top == n - 1) {
            System.out.println("Stack overflow");
        } else
            arr[++top] = ele;
    }

    void pop(int[] arr, int n) {
        if (top == -1)
            System.out.println("Stack Underflow");
        else {
            System.out.println("Element deleted: " + arr[top]);
            top--;
        }
    }

    void display(int[] arr, int n) {
//        int i ;
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Array elements are: ");
            for (int i = top; i>=0; --i) {
//            for(int i = 0; i<=top;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
public class StackF {
    public static void main(String[] args) {
        Start ob = new Start();
        int ch, l= 1,n,ele;
        int[] arr;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array length ");
        n = in.nextInt();
         arr = new int[n];
        while(l>0){
            System.out.println("-----MENU-----");
            System.out.println("\n1.Push\n 2.Pop\n 3.Display\n 4.Exit\n");
            System.out.println("Enter the choice: ");
            ch = in.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the array element ");
                    ele = in.nextInt();
                    ob.push(ele,arr,n);
                    break;
                case 2:
                    ob.pop(arr,n);
                    break;
                case 3:
                    ob.display(arr,n);
                    break;
                case 4: System.exit(0);
                break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

}


