
//Given a string containing just the characters '(' and ')', 
//return the length of the longest valid (well-formed) parentheses substring.
import java.util.*;
public class longest_paranthesis {
    public static int longestValidParanthesis(String s){
     Stack<Integer> st = new Stack<>();
     int n = s.length();
     st.push(-1);
     int maxlen =0;
     for(int i=0;i<n;i++){
        char c = s.charAt(i);
        if(c =='('){
            st.push(i);
        }else{
            st.pop();
            if(st.isEmpty()){
                st.push(i);
             } else{
                    maxlen = Math.max(maxlen , i-st.peek());
                }
            }
        }
        return maxlen;
    }
    public static void main(String args[]){
        String s=  ")()())";
        System.out.println("longest valid paranthesis length:" +longestValidParanthesis(s)); // output : longest valid paranthesid length:4
    }
}

