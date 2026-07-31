// Remove Outermost Parentheses
//For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
import java.util.*;
public class remove_outer {
    public String removeOuterParenthesis(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                if(!st.isEmpty()){
                    ans.append(c);
                }
                st.push(c);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        remove_outer sol = new remove_outer();
        String s = "(()())(())";
        String ans = sol.removeOuterParenthesis(s);
        System.out.println("Input: " + s);
        System.out.println("Output: " + ans); // output : ()()()
    }
}
