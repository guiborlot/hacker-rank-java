import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.printf("US: %s%n", nf.format(value));
        nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.printf("India: %s%n", nf.format(value));
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.printf("China: %s%n", nf.format(value));
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.printf("France: %s%n", nf.format(value));

    }
}
