//Given an integer array arr[ ]. For every element in the array, the task is to determine its Next Smaller Element (NSE).
//The Next Smaller Element (NSE) of an element x is the first element that appears to the right of x in the array and is strictly smaller than x.
//If no such element exists, assign -1 as the NSE for that position.
import java.util.*;

public class next_smaller {
    public static int[] nextsmallelement(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {4, 8, 5, 2, 25};
        int ans[] = nextsmallelement(arr);
        System.out.println(Arrays.toString(ans));// output:[2, 5, 2, -1, -1]
    }
}
