import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function

        if(a.length() != b.length()){
            return false;
        }

        char[] char1 = a.toLowerCase().toCharArray();
        char[] char2 = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(char1);
        java.util.Arrays.sort(char2);

        if(!java.util.Arrays.equals(char1, char2)){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
