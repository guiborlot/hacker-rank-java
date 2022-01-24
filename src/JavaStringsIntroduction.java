import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + b.length());

        boolean isGreater = (a.compareTo(b) > 0) ? true : false;
        if(isGreater){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.print(a + " " + b);
        /* Enter your code here. Print output to STDOUT. */

    }
}
