import java.io.*;
import java.util.*;

public class JavaIntToString{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n >= -100 && n <= 100){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}