// A thief cannot loot two consecutive houses and aims to maximize his total loot.
//using Dynamic programming
public class stickler_thief {
    public int total(int arr[]){
        int n = arr.length;
        if(n==0)
        return 0;
        if(n==1)
        return arr[0];
        int last1 = arr[0];
        int last2 = Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            int curr = Math.max(arr[i]+last1,last2);
            last1 = last2;
            last2 = curr;
        }
       return last2; 
    }
    public static void main(String[] args) {
        stickler_thief s = new stickler_thief();
        int arr[] = {6, 5, 5, 7, 4};
        System.out.println("Maximum loot: " + s.total(arr));//15
    }
}
