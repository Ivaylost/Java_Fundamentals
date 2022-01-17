package BasicSintax_Excercise;

import java.util.Scanner;

public class VendorMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        double inputMoney = 0;

        while (!input.equals("Start")) {

            if (isNumeric(input))
            {
                if(isAcceptable(Double.parseDouble(input)))
                {
                    sum += Double.parseDouble(input);
                } else{
                    System.out.printf("Cannot accept %s%n", input);
                }
            }
            input = scanner.nextLine();
        }

        while (true){

            input = scanner.nextLine();
            if (input.equals("End")){
                System.out.printf("Change: %.2f%n", sum);
                break;
            }

            if(sum - getPrice(input)< 0){
                System.out.println("Sorry, not enough money");
            } else if(getPrice(input) == 0){
                System.out.println("Invalid product");
            } else {
                System.out.printf("Purchased %s%n", input);
                sum -= getPrice(input);
            }
        }
    }

    //"Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0

    public static double getPrice(String input){
        switch (input){
            case "Nuts" : return 2;
            case "Water" : return 0.7;
            case "Crisps" : return 1.5;
            case "Soda" : return 0.8;
            case "Coke" : return 1.0;
        }
        return 0;
    }

    public static boolean isAcceptable(Double input){
        //0.1, 0.2, 0.5, 1, and 2
        return input == 0.1 || input == 0.2 || input == 0.5 || input == 1 || input == 2;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
