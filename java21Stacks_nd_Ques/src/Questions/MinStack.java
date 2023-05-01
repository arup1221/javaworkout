//155. Min Stack
package Questions;

import java.util.Stack;

class MinStack {
    int min=Integer.MAX_VALUE;
    private Stack<Integer> first;


    public  MinStack() {


        first = new Stack<>();
    }

    public void push(int val) {
        if(val<= min){
            first.push(min);
            min = val;
        }
        first.push(val);
    }

    public void pop() {

        if (first.pop()==min){
            min=first.pop();
        }


    }

    public int top() {
        int peak = 0;

        peak = first.peek();

        return peak;
    }

    public int getMin() {

        return min;
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
  obj.push(-2);
  obj.push(0);
  obj.push(-3);
  int min = obj.getMin();
  System.out.println(min);
  obj.pop();
  int top = obj.top();
  System.out.println(top);
        min = obj.getMin();
        System.out.println(min);

    }
}