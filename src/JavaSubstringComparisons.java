import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String[] strings = new String[s.length()-k+1];

        for(int i=0;i<s.length();i++){
            if(i+k <= s.length()){
                strings[i] = s.substring(i, i+k);
            }
        }

        smallest = strings[0];
        for(int i = 1; i< strings.length; i++){
            if(smallest.compareTo(strings[i]) > 0){
                smallest = strings[i];
            }
        }

        largest = strings[0];
        for(int i = 1; i< strings.length; i++){
            if(largest.compareTo(strings[i]) < 0){
                largest = strings[i];
            }
        }

        return smallest + "\n" + largest;
    }
}
