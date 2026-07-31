 //To find the largest rectangular area possible in the given histogram
import java.util.*;
class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            int currele = (i==n)?0:arr[i];
            while(!st.isEmpty() && arr[st.peek()]>currele){
                int height = arr[st.pop()];
                int prevsmall = (st.isEmpty()?-1:st.peek());
                int weidth=i-prevsmall-1;
                max=Math.max(max,height*weidth);
            }
            st.push(i);
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}
public class histogram {   
    public static void main(String[] args) {
        int arr[] = {6, 2, 5, 4, 5, 1, 6};
        int ans = Solution.getMaxArea(arr);
        System.out.println("Maximum Area: " + ans);// output : 12
    }
}

