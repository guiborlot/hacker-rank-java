import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder(a);
        if(sb.reverse().toString().equals(a)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
