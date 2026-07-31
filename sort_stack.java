// sort the given stack in increasing order
import java.util.*;
public class sort_stack {
    public static void stack_sort(Stack<Integer> st){
       if(!st.isEmpty()){
        int top = st.pop();
        stack_sort(st);
        insert_sorted(st,top);
       }
    }
        public static void insert_sorted(Stack<Integer> st ,int x){
         if(st.isEmpty() || st.peek()<x){
            st.push(x);
            return;
         }
         int top = st.pop();
         insert_sorted(st , x);
         st.push(top);
        }
        public static void main(String args[]){
              Stack<Integer> st = new Stack<>();
        st.push(41);
        st.push(3);
        st.push(32);
        st.push(2);
        st.push(11);

        System.out.println("Original Stack: " + st); // [41, 3, 32, 2, 11]
        stack_sort(st);
        System.out.println("Sorted Stack: " + st); // output : [2, 3, 11, 32, 41]
        }
 }
