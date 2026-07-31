// To Search array with adjacent diff at most k
public class Adjacent_diff {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        // code here
        int n = arr.length;
        int i=0;
        //for(int i=0;i<n;)
        while(i<n){
            if(arr[i]==x){ // element found
            return i; // returning the element
        }
        int diff = Math.abs(arr[i]-x)/k; // calculating to skip  how  many steps 
        diff = Math.max(1,diff); // to move atleast one step
        i = i+diff; // moving according to the calculated steps
        }
        return -1;
    }
    public static void main(String args[]){
        Adjacent_diff obj = new Adjacent_diff();
        int[] arr = {20, 40, 50, 70, 70, 60};
        int k = 20, x = 60;
        int index = obj.findStepKeyIndex(arr, k, x);
        System.out.println("Index of " + x + " = " + index);
    }
}
