// To find the maximum difference
class maximum {
    public static int findMaxValue(int n, int[][] mat) {
        // code here
         n = mat.length;
        int maximumArray[][] = new int[n][n];
        maximumArray[n-1][n-1] = mat[n-1][n-1];
        //from last row
        for(int j = n-2;j>=0;j--){
            maximumArray[n-1][j]=Math.max(mat[n-1][j] ,
            maximumArray[n-1][j+1]);
        }
        for(int i = n-2;i>=0;i--){
            maximumArray[i][n-1]=Math.max(mat[i][n-1],
            maximumArray[i+1][n-1]);
        }
        
        // fill the remaining rows and coloums
        for(int i=n-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                maximumArray[i][j]=Math.max(mat[i][j],
                Math.max(maximumArray[i+1][j],maximumArray[i][j+1]));
            }
        }
        // calculate the maximum difference
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
             ans = Math.max(ans , maximumArray[i+1][j+1]-mat[i][j]);   
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int mat[][]={
             { 1, 2, -1, -4, -20 },
             { -8, -3, 4, 2, 1 }, 
             { 3, 8, 6, 1, 3 },
             { -4, -1, 1, 7, -6 },
             { 0, -4, 10, -5, 1 }
            };
    int  n = mat.length;
   System.out.println("maximum difference = " + findMaxValue(n, mat));
  }
}
