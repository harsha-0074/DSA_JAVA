//traversing the boundary
import java.util.ArrayList;
public class boundary_traversal {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> al  = new ArrayList<>();
        int n = mat.length;
        int m  = mat[0].length;
        // top row 
        for(int right=0;right<m;right++){
            al.add(mat[0][right]);
        }
        // last coloum
        for(int down=1;down<n;down++){
            al.add(mat[down][m-1]);
        }
        //last row
        if(n>1){
        for(int bott=m-2;bott>=0;bott--){
            al.add(mat[n-1][bott]);
        }
        }
        //first column
        if(m>1){
        for(int up=n-2;up>=1;up--){
            al.add(mat[up][0]);
        }
        }
        return al;
    }
    public static void main(String args[]){
        int mat[][]  = {{12, 11, 10, 9},
                         {8, 7, 6, 5},
                         {4, 3, 2, 1}};
        boundary_traversal obj = new boundary_traversal();
        ArrayList<Integer> result = obj.boundaryTraversal(mat);

        // Print the boundary traversal
        System.out.println(result);
    }
}
