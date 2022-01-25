import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.

        if(s.length() == 0){
            System.out.println(0);
        } else {
            String[] out = s.split("[\\s,?'!_.@]+");

            System.out.println(out.length);
            for(String x: out){
                System.out.println(x);
            }
        }
        scan.close();
    }

}
