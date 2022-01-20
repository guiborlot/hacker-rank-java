import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int b;
    static int h;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         b = scanner.nextInt();
         h = scanner.nextInt();

         if(b <= 0 || h <= 0){
             System.out.println("java.lang.Exception: Breadth and height must be positive");
         } else {
             System.out.println(b*h);
         }
    }
}
