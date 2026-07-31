// To find K-diff Pairs in an Array
import java.util.HashMap;
public class diff_pairs {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        if(k<0)
        return 0;
        // Build frequency map
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
        if(hm.containsKey(nums[i])){
        hm.put(nums[i],hm.get(nums[i])+1);
        }else{
            hm.put(nums[i],1);
        }
        }
        //Iterate over keys
        Object[] keysArray = hm.keySet().toArray();
        for(int i=0;i<keysArray.length;i++){
            int key = (int) keysArray[i];
            // Need duplicates
            if(k==0){
                if(hm.get(key)>1)
                count++;
                // Look for another number = key + k
            }else{
                if(hm.containsKey(key+k)){
                count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        diff_pairs obj = new diff_pairs();
        int[] nums1 = {3, 1, 4, 1, 5};
        int k = 2;
        System.out.println("number of pairs: " + obj.findPairs(nums1, k)); 
    }
}
