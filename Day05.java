import java.util.Stack;
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        if(A==null||A.length()!=n){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        char[] arr=A.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                stack.push(arr[i]);
            }
            else if(arr[i]==')'){
                //如果字符串为")()"或者"())"时，则返回false.
                if(stack.isEmpty()){
                    return false;
                    //说明栈中一定含有左括号，进行出栈操作
                }else{
                    stack.pop();
                }
                //其他情况比如出现"a()"等
            }else{
                return false;
            }
        }
        //比如出现"()()("情况
        return stack.isEmpty()?true:false;
    }
}