//921. Minimum Add to Make Parentheses Valid
package Questions;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }
    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();

                }else{
                    stack.push(ch);
                }
            }
            else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
    public int minInsertions(String s) {

        Stack<Character> stack = new Stack<>();
        int insertionneeded =0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);

            if(c == '('){
                if(stack.isEmpty()){
                    stack.push(c);
                }
                else {
                    if(stack.peek() != '('){
                        insertionneeded ++;
                        stack.pop();
                        stack.pop();
                    }
                    stack.push(c);
                }
            }
            else{
                if(stack.isEmpty()){
                    insertionneeded++;
                    stack.push('(');
                    stack.push(c);
                }
                else{
                    if(stack.peek() == '('){
                        stack.push(c);
                    }else{
                        stack.pop();
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return insertionneeded;
        }else{
            while(!stack.isEmpty()){
                char c = stack.pop();
                if(c == '('){
                    insertionneeded +=2;
                }
                else{
                    insertionneeded++;
                    stack.pop();
                }
            }
        }
        return insertionneeded;
    }
}
