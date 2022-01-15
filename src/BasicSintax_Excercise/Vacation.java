package BasicSintax_Excercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String category = scanner.nextLine();
        String day = scanner.nextLine();

        double price = getPrice(category, day);
        double amount = calculateAmount(price, num, category);

        System.out.printf("Total price: %.2f", amount);

    }

    public static double calculateAmount(Double price, int num, String category){
        double amount = 0;
        if (category.equals("Students") && num >= 30){
            amount = (price*num)*0.85;
        } else if (category.equals("Business") && num >= 100){
            amount = price*(100-10);
        } else if (category.equals("Regular") && num >= 10 && num <= 20){
            amount = (price*num)*0.95;
        } else {
            amount = num*price;
        }

        return amount;
    }

    public static double getPrice(String category, String day){

        double price = 0;
        if (day.equals("Friday")){
            switch (category){
                case "Students":
                    price = 8.45;
                    break;
                case "Business":
                    price = 10.90;
                    break;
                case "Regular":
                    price = 15;
                    break;
            }
        }

        if (day.equals("Saturday")){
            switch (category){
                case "Students":
                    price = 9.80;
                    break;
                case "Business":
                    price = 15.60;
                    break;
                case "Regular":
                    price = 20;
                    break;
            }
        }

        if (day.equals("Sunday")){
            switch (category){
                case "Students":
                    price = 10.46;
                    break;
                case "Business":
                    price = 16;
                    break;
                case "Regular":
                    price = 22.50;
                    break;
            }
        }

        return price;
    }
}
