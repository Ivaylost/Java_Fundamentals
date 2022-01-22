package DataTypesAndVariables;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double centuries = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", centuries, centuries*100,
                (centuries*100*365.2422), (centuries*100*365.2422*24), (centuries*100*365.2422*24*60));
    }
}
