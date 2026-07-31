import java.util.HashSet;
public class happy_num {
    static int isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        
        while (n != 1 && !hs.contains(n)) {
            hs.add(n);
            n = sum_squares(n);
        }
        
        // if n becomes 1 → Happy Number
        if (n == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    // make this static to call from static context
    static int sum_squares(int num) {
        int sum = 0;
        while (num > 0) {
            int dig = num % 10;
            sum += dig * dig;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println("Result: " + isHappy(n));
    }
}
