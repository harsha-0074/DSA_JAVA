//Given an array, arr[] and an integer x, return true if there exists a pair of elements in the array
//whose absolute difference is x, otherwise, return false.
import java.util.Arrays;
public class pair_diff {
    public boolean findPair(int[] arr, int x) {
        // code here
        int n = arr.length;
        int i =0;
        int j = 1;
        Arrays.sort(arr);
        while(i<n && j<n){
            if(i!=j && arr[j]-arr[i]==x){
                return true;
            }else if(arr[j]-arr[i]<x){
                j++;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        pair_diff obj = new pair_diff();

        int[] arr = {5, 20, 3, 2, 5, 80};
        int x = 78;
        System.out.println(obj.findPair(arr, x));//True
    }
}
