package BasicSintax_Excercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        int days = 0;
        double pricePerCapsule = 0;
        int count = 0;
        double sum = 0;
        double totalSum = 0;

        for (int i = 1; i <= orders ; i++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            count = Integer.parseInt(scanner.nextLine());
            sum = pricePerCapsule*days*count;
            totalSum += sum;
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
        }

        System.out.printf("Total: $%.2f", totalSum);
    }
}
