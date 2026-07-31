//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
 
import java.util.Stack;
public class validparanthesis{
    public static boolean isValid(String s) {
        int n = s.length();
        if(n%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.peek();
                if(ch == ')' && top!= '('){
                    return false;
                }else if(ch == ']' && top!= '['){
                    return false;
                }else if(ch == '}' && top!= '{'){
                    return false;
                }else{
                 st.pop();
                }
            }
        }
        return st.size()==0;
    }
    public static void main(String args[]){
        String s = "{[]}";
        System.out.println(validparanthesis.isValid(s));// output : true
    }
}
