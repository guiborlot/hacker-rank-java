import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int aux = b;
            System.out.print((a+b) + " ");
            for(int j = 1; j < n; j++){
                aux += (Math.pow(2, j)) * b;
                int out = a + aux;
                System.out.print(out + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
