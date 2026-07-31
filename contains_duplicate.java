//Given an integer array arr and an integer k,
//return true if there are two distinct indices i and j in the array such that arr[i] == arr[j] and abs(i - j) <= k.
import java.util.*;
public class contains_duplicate {
    public boolean reoccur(int arr[] , int k){
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
         if(hm.containsKey(arr[i])){ // checks the element
            int ans = hm.get(arr[i]); // if same element found
            if(i-ans<=k){ // check if both are less than or equals to k
                return true;
            }
         }
         hm.put(arr[i],i); // update the last seen inde
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1};
        int k = 3;
        contains_duplicate obj = new contains_duplicate();
        System.out.println(obj.reoccur(arr, k));// output : true
    }
}
