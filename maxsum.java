// Maximum sum of sub Array with K elements
//Sliding window Technique
public class maxsum {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int max_sum =0;
        int curr_sum =0;
        for(int i=0;i<k;i++){
            curr_sum = curr_sum + arr[i];
        }
        if(curr_sum>max_sum){
            max_sum = curr_sum;
        }
        for(int i =k;i<n;i++){
             curr_sum = curr_sum+arr[i];     //Adding new element at the last of the k sized window
            curr_sum = curr_sum-arr[i-k];  //Removing the first element of the k sized window
            if(curr_sum>max_sum){
            max_sum = curr_sum;   // updating the current sum
        }
    }
    return max_sum;
    }
    public static void main(String args[]){
        int arr[] =  {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k =4;
        maxsum ma = new maxsum();
    int result = ma.maxSubarraySum(arr,k);
     System.out.println("Maximum Subarray Sum ="  + result);
    }
}
