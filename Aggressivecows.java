//given an array with unique elements of stalls[], which denote the positions of stalls. 
//And also given an integer k which denotes the number of aggressive cows.
//The task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible
import java.util.Arrays;

public class Aggressivecows {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1;
        int high = stalls[n-1]-stalls[0];
        int ans =0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(placed(stalls,k,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return  ans;
    }
    // to  check if the cows can be placed at  given distance
    private static boolean placed(int stalls[],int k,int dist){
        int count = 1;
        int  lastposition =  stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastposition>=dist){
                count++;
                lastposition = stalls[i];
            }
            if(count == k)
            return true;
        }
        return false;
    }
    public static void main(String  args[]){
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCows(stalls, k));
    }
}
