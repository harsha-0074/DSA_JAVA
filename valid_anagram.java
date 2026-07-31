// To check whether both strings are anagrams or not
//Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.
import java.util.*;
public class valid_anagram {
    public static boolean anagram(String s , String t){
     if(s.length() != t.length()){
        return false;
     }
     char arr1[] = s.toCharArray();
    char arr2[] = t.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i=0;i<s.length();i++){
        if(arr1[i]!=arr2[i]){
            return false;
        }
    }
    return true;
    }
    public static void main(String args[]){
      String  s = "anagram";
      String t = "nagaram";
      System.out.println(anagram(s,t)); // output : true
    }
}
