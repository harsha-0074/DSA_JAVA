// Trapping rain water problem
class trappingwater {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int left_max[] = new int[n];
        int right_max[] = new int[n];
        
        // calculating the left  max array
        left_max[0]=arr[0];
        for(int i=1;i<n;i++){
           left_max[i]=Math.max(arr[i],left_max[i-1]); 
        }
        // calculating the right max array
        right_max[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(arr[i],right_max[i+1]);
        }
        //the trapped water
        int total_fill =0;
        for(int i=1;i<=n-2;i++){
            int minimum = Math.min(left_max[i],right_max[i]);
            total_fill = total_fill + (minimum-arr[i]);
        }
        return total_fill;
    }
    public static void main(String args[]){
        trappingwater wt = new trappingwater();
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(wt.maxWater(arr));
    }
}
