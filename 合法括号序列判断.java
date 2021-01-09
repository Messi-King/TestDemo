import java.util.Stack;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        if(A == null ) {
            return false;
        }
        for(int i = 0;i<A.length();i++){
            if(A.charAt(i) == '(' ) {
                stack.push(A.charAt(i));
            }else if(A.charAt(i) == ')') {
                if(stack.isEmpty()){
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}