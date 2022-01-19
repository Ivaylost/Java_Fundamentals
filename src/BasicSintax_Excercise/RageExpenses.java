package BasicSintax_Excercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());
        double amount = 0.00;
        int counterKeyBoard = 0;


        for (int i = 1; i <= lostGames; i++) {
            if (i%2 == 0){
                amount += headset;
            }

            if (i%3 == 0){
                amount += mouse;
            }

            if (i%2 == 0 && i%3 == 0){
                amount += keyboard;
                counterKeyBoard++;
            }

            if (counterKeyBoard == 2){
                amount += display;
                counterKeyBoard = 0;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", amount);
    }
}
