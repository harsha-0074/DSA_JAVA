// to  find  the length of the last word
public class last_word {
    public int findLength(String s) {
        // code here
        s = s.trim();
        int last = s.lastIndexOf(" ");
        if(last == -1){
            return s.length();
        }
        return s.length() - last - 1;
    }
    public static void main(String[] args) {
        String s = "Hello World";
         last_word obj = new last_word();
        System.out.println(obj.findLength(s)); // output - 5
    }
}
