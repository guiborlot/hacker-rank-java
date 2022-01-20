import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        while(scanner.hasNext()){
            System.out.println(count + " " + scanner.nextLine());
            count++;
        }
    }
}
