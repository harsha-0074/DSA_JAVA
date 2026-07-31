// SNAKE PATTERN
import java.util.ArrayList;
public class snake_pattern {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        ArrayList<Integer> al = new ArrayList<>();

        for (int r = 0; r < rows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < cols; c++) {
                    al.add(matrix[r][c]);
                }
            } else {
                for (int c = cols - 1; c >= 0; c--) {
                    al.add(matrix[r][c]);
                }
            }
        }
        return al;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        ArrayList<Integer> res = snakePattern(matrix);
        System.out.println(res);
    }
}
