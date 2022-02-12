package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double q = Double.parseDouble(scanner.next());

        double price = getPrice(product);

        System.out.printf("%.2f", price*q);
    }

    public static double getPrice(String product){
        switch (product){
            case "coffee" : return 1.50;
            case "water " : return 1.00;
            case "coke" : return 1.40;
            case "snacks" : return 2.00;
        }
        return 0;
    }
}
