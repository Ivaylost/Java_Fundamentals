package BasicSintax_Excercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int corrector = 0;

        if (num%2 == 0){
            corrector = 2;
        }
        if (num%3 == 0){
            corrector = 3;
        }
        if (num%6 == 0){
            corrector = 6;
        }
        if (num%7 == 0){
            corrector = 7;
        }
        if (num%10 == 0){
            corrector = 10;
        }

        if (corrector == 0){
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d%n", corrector);

        }
    }
}
