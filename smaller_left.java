//Given an array arr[] of integers, for each element in the array, 
//find the nearest smaller element on its left. If there is no such smaller element, return -1 for that position.
import java.util.*;
public class smaller_left {
public int[] leftSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements greater or equal to current
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // If stack empty → no smaller element
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            // Push current element
            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        smaller_left sol = new smaller_left();
        int[] arr = {1, 5, 0, 3, 4, 5};
        System.out.println(Arrays.toString(sol.leftSmaller(arr)));
    }
}
