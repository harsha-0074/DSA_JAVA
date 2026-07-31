//KADANE'S ALGORITHM
//To find the maximum subarray sum
public class kadanes_Alg {
    public int sub_Array(int arr[]){
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;
        int curr_sum =0;
        for(int i=0;i<n;i++){
            curr_sum = curr_sum+arr[i];
            if(curr_sum>max_sum){
             max_sum = curr_sum;
            }if(curr_sum<0){
                curr_sum =0;
            }
        }
        return max_sum;
    }
    public static void main(String args[]){
    int arr[] =  {-2,1,-3,4,-1,2,1,-5,4};
    kadanes_Alg ka = new kadanes_Alg();
    int result = ka.sub_Array(arr);
     System.out.println("Maximum Subarray Sum ="  + result);
    }
}
