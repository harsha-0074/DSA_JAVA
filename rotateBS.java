
// Search an element in sorted and rotated array
class rotateBS{
    static int rotatesearch(int array[], int target) {
        // code here
        int n = array.length;
        int low =0;
        int high = n-1;
        //int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(array[mid]==target){
                return mid;  // target  is found
            }
         if(array[low]<array[mid]){
             if(target>=array[low] && target<array[mid]){  // when left half is sorted
                high = mid-1;
            }else{
                low = mid+1;
            }
         }
            else{
               if(target>array[mid] && target<=array[high]){  // when right is sorted
                   low = mid+1;
               }else{
                   high = mid -1;
               }
            }
        }
        return  -1; // the value is  not found
    }
    public static void main(String args[]){
        // int n = 9;
         int Array[] = {5,6,7,8,9,10,1,2,3};
         int target = 10;
         System.out.println("target value index = " + rotatesearch(Array, target));
    }
}
