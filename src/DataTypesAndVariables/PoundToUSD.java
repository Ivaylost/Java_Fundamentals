package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoundToUSD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal pounds = new BigDecimal(scanner.nextLine());
        BigDecimal corrector = new BigDecimal("1.36");
        BigDecimal result = pounds.multiply(corrector);
        System.out.printf("%.3f", result);
    }
}
