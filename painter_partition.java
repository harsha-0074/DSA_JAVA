//Given an array arr[] where each element denotes the length of a board, and an integer k representing the number of painters available.
//Each painter takes 1 unit of time to paint 1 unit length of a board.
//Determine the minimum amount of time required to paint all the boards, 
//under the constraint that each painter can paint only a contiguous sequence of boards
class painter_partition{
public int minTime(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = 0;
        for(int i =0;i<n;i++){
            low = Math.max(low,arr[i]);
            high = high+arr[i];
        }
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isCorrect(arr,n,k,mid)){
                ans = mid;
                high = mid -  1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    boolean isCorrect(int arr[],int n,int k,int timeallowed){
       int painter = 1;
        int time = 0;
        for(int i=0;i<n;i++){
            if(time+arr[i]<=timeallowed){
            time  = time + arr[i];
        }else{
            painter++;
            time  = arr[i];
            
            if(painter>k)
         return false;
        }
    }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {5, 10, 30, 20, 15};
        int k =  3;
        painter_partition pt = new  painter_partition();
        int  result = pt.minTime(arr,k);
        System.out.println("the optimal allocation of boards is : " + result);// output : 35
    }
}
