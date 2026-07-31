//Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
//Note that after backspacing an empty text, the text will continue empty.
import java.util.*;
public class bacspace_compare {
    public static boolean backspaceCompare(String s, String t){
    Stack<Character> st1 = new Stack<>();
    Stack<Character> st2 = new Stack<>();
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c == '#'){
            if(!st1.isEmpty()){
                st1.pop();
            }
        }else{
                st1.push(c);
            }
    }
    for(int i=0;i<t.length();i++){
        char k = t.charAt(i);
        if(k == '#'){
            if(!st2.isEmpty()){
                st2.pop();
            }
        }else{
                st2.push(k);
            }
        }
    return st1.equals(st2);
    }
    public static void main(String args[]){
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(bacspace_compare.backspaceCompare(s,t));// output : True
    }
}
