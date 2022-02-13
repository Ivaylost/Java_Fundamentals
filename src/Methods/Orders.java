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
        double price = 0;
        //String x = "coffee";
        switch (product){
            case "coffee" :
                price = 1.50;
                break;
            case "water" :
                price = 1.00;
                break;
            case "coke" :
                price = 1.40;
                break;
            case "snacks" :
                price = 2.00;
                break;
        }
        return price;
    }
}
