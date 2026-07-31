//Alice has n candies The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). 
//Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
import java.util.HashSet;
public class candies {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
       hs.add(candyType[i]);
        }
        return Math.min(hs.size(),n/2);
    }
    public static void main(String args[]){
   int candyType[] = {1,1,2,2,3,3};
   candies obj = new candies(); // create object
        System.out.print(obj.distributeCandies(candyType));
    }
}
