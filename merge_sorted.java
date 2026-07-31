// given Two integer arrays nums1 and nums2, sorted in non-decreasing order,
//and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
public class merge_sorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = m-1;
       int j = n-1;
       int k = m+n-1;
       while(i>=0  && j>=0){
        if(nums1[i]> nums2[j]){
            nums1[k--] = nums1[i--];
        }else{
            nums1[k--] = nums2[j--];
        }
       }
       while(j>=0){
        nums1[k--] =  nums2[j--];
       }
    }
    public static void main(String args[]){
        merge_sorted obj = new merge_sorted();
       int nums1[] = {1,2,3,0,0,0};
       int m = 3; 
        int []nums2 = {2,5,6};
        int n = 3;
       obj.merge(nums1, m, nums2, n);
       System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " "); // output :  1 2 2 3 5 6
        }
    }
}
